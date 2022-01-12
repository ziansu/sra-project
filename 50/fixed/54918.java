public void list() {
    java.util.Map<java.lang.String, java.lang.Object> propMap = dbConfigSource.getDatabasePropertyMap();
    java.lang.System.out.println(propMap.toString());
}