private java.lang.String getTargetFilter(java.lang.StringBuilder reusableStringBuilder, org.apache.solr.handler.component.RuleManagerComponent.PageType pageType, java.lang.String q) throws java.io.IOException {
    java.lang.StringBuilder targetFilter = reuseStringBuilder(reusableStringBuilder);
    if (pageType == (org.apache.solr.handler.component.RuleManagerComponent.PageType.search)) {
        if (org.apache.commons.lang.StringUtils.isEmpty(q)) {
            throw new java.io.IOException("Cannot process search request because the 'q' param is empty.");
        }
        targetFilter.append("(target:allpages OR target:searchpages) AND ((");
        targetFilter.append(org.apache.solr.client.solrj.util.ClientUtils.escapeQueryChars(q));
        targetFilter.append(")^2 OR query:__all__)");
    }else {
        targetFilter.append("target:allpages OR target:categorypages");
    }
    return targetFilter.toString();
}