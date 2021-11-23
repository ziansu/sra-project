private java.lang.String getAProperty(java.lang.String namedProperty) throws java.lang.Exception {
    java.lang.Object obj = props.get(namedProperty);
    if (obj == null)
        throw new java.lang.Exception(((("Error!  Could not find " + namedProperty) + " in ") + (this.propertiesFile)));
    
    return obj.toString();
}