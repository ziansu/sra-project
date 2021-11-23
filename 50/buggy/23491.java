public void renameProperty(final java.lang.String iOldName, final java.lang.String iNewName) {
    final com.orientechnologies.orient.core.metadata.schema.OProperty p = properties.remove(iOldName);
    if (p != null)
        properties.put(iNewName, p);
    
}