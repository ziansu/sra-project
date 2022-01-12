public java.lang.Object findProperty(java.lang.String name) {
    if ("compare_locale".equals(name))
        return collator;
    
    return scriptFunctionContext.findProperty(name);
}