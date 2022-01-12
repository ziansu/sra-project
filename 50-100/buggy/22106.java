@java.lang.Override
protected java.lang.String getRefreshNoItemContainerJavaScript(java.lang.String id, java.lang.String parentId, java.lang.Boolean isVisible) {
    if (isVisible()) {
        java.lang.String cssClass = "list-group-item";
        java.lang.String javaScript = java.lang.String.format(("jQuery(\"#%s\").remove(); " + (("var item = jQuery(\"<div></div>\"); " + "item.attr(\"id\", \"%s\").attr(\"class\", \"%s\"); ") + "jQuery(\"#%s .list-group\").prepend(item);")), id, id, cssClass, parentId);
        return javaScript;
    }else {
        java.lang.String javaScript = java.lang.String.format("jQuery(\"#%s\").remove();", id);
        return javaScript;
    }
}