@java.lang.Override
protected java.lang.String getRemoveItemJavaScript(java.lang.String id) {
    java.lang.String javaScript = java.lang.String.format("var item = jQuery(\"#%s\"); item.remove();", id);
    return javaScript;
}