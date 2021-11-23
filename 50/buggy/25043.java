protected void errorIfPropertySetAfterBeanConfigured(java.lang.String description) {
    if (propertiesSet)
        throw new java.lang.IllegalAccessError((((("Attempt to set property " + description) + " in bean ") + (getName())) + "after Bean configured!"));
    
}