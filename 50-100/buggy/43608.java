private com.orientechnologies.orient.core.metadata.schema.OClass addClassToSchema(com.orientechnologies.orient.core.metadata.schema.OSchema schema, org.orienteer.architect.util.OArchitectOClass architectOClass) {
    java.lang.String name = architectOClass.getName();
    com.orientechnologies.orient.core.metadata.schema.OClass oClass = schema.getOrCreateClass(name);
    if (architectOClass.isExistsInDb())
        removePropertiesFromOClass(oClass, architectOClass.getPropertiesForDelete());
    
    addSuperClassesToOClass(schema, oClass, architectOClass.getSuperClasses());
    addPropertiesToOClass(schema, oClass, architectOClass.getProperties());
    return oClass;
}