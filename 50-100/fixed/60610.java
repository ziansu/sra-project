private java.lang.String getProjectItemValue(org.ff.rest.project.resource.ProjectResource projectResource, org.ff.jpa.domain.Item.ItemMetaTag metaTag) {
    java.lang.String result = "";
    for (org.ff.rest.project.resource.ProjectItemResource projectItemResource : projectResource.getItems()) {
        if ((projectItemResource.getItem().getMetaTag()) == metaTag) {
            if (metaTag == (org.ff.jpa.domain.Item.ItemMetaTag.COMPANY_INVESTMENT_AMOUNT)) {
                result = ((projectItemResource.getValue()) != null) ? projectItemResource.getValue().toString() : "";
            }else {
                result = projectItemResource.getValueMapped();
            }
        }
    }
    return result;
}