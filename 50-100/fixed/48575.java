private java.lang.String getUrlToDependentModule(org.openl.rules.lang.xls.syntax.TableSyntaxNode node) {
    java.lang.String url = org.openl.rules.webstudio.web.util.WebStudioUtils.getWebStudio().url("table", node.getUri());
    if ((url != null) && (url.endsWith("table"))) {
        url += (("?" + (org.openl.rules.webstudio.web.util.Constants.REQUEST_PARAM_ID)) + "=") + (node.getId());
    }
    return url;
}