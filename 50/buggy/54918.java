public void list() {
    com.blackducksoftware.core.properties.Map<java.lang.String, java.lang.Object> propMap = dbConfigSource.getDatabasePropertyMap();
    java.lang.System.out.println(propMap.toString());
}