private void valueToProperty(java.lang.String name, java.lang.Object value, boolean isClass, java.lang.Class<?> typeClass) {
    if (isClass)
        value = ((aQute.bnd.osgi.Descriptors.TypeRef) (value)).getFQN();
    
    if (typeClass == null)
        typeClass = value.getClass();
    
    java.lang.String type = typeClass.getSimpleName();
    component.propertyType.put(name, type);
    props.add(name, value.toString());
}