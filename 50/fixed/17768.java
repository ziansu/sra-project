@java.lang.Override
protected java.lang.String getRemoveItemJavaScript(java.lang.String id) {
    return java.lang.String.format("var item = jQuery(\"#%s\"); item.remove();", id);
}