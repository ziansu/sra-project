public java.lang.String getAttribute(java.lang.String name) {
    if ((attributes) == null)
        throw new com.badlogic.gdx.utils.GdxRuntimeException(((("Element " + name) + " doesn't have attribute: ") + name));
    
    java.lang.String value = attributes.get(name);
    if (value == null)
        throw new com.badlogic.gdx.utils.GdxRuntimeException(((("Element " + name) + " doesn't have attribute: ") + name));
    
    return value;
}