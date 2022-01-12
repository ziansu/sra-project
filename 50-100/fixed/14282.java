public boolean isExactMatch(java.lang.String url) {
    if (!("/".equals(url))) {
        url = org.apache.synapse.rest.RESTUtils.trimTrailingSlashes(url);
    }
    int index = url.indexOf('?');
    if (index > 0) {
        url = url.substring(0, index);
    }else
        if (index == 0) {
            url = "/";
        }
    
    return ((exactMatch) != null) && (exactMatch.equals(url));
}