public java.lang.Object findProperty(java.lang.String name) {
    if ("compare_locale".equals(name))
        return collator;
    
    if (scriptFunctionContext == null)
        return null;
    
    return scriptFunctionContext.findProperty(name);
}