@java.lang.Override
protected java.lang.String getAppendItemJavaScript(java.lang.String id, java.lang.String parentId, int index, org.apache.wicket.model.IModel<java.lang.Character> model, java.lang.Boolean isSelected) {
    java.lang.String cssClass = (isSelected) ? "list-group-item active" : "list-group-item";
    return java.lang.String.format(("var item = jQuery(\"<div></div>\"); " + ((("item.attr(\"id\", \"%s\").addClass(\"%s\"); " + "item.append(") + "jQuery(\"<span></span>\").text(\"%s\")); ") + "jQuery(\"#%s .list-group\").append(item);")), id, cssClass, model.getObject().getCharacter(), parentId);
}