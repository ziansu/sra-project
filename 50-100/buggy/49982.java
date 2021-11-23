private void valueToProperty(java.lang.String name, java.lang.Object value, boolean isClass, boolean isCharacter) {
    if (isClass)
        value = ((aQute.bnd.osgi.Descriptors.TypeRef) (value)).getFQN();
    
    java.lang.Class<?> typeClass = (isCharacter) ? java.lang.Character.class : value.getClass();
    java.lang.String type = typeClass.getSimpleName();
    component.propertyType.put(name, type);
    props.add(name, value.toString());
}