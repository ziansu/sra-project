private java.lang.String loadComponentJSonSchema(java.lang.ClassLoader classLoader, java.lang.String scheme, java.lang.String javaType) {
    int pos = javaType.lastIndexOf('.');
    java.lang.String path = javaType.substring(0, pos);
    path = path.replace('.', '/');
    path = new java.lang.StringBuilder(path).append("/").append(scheme).append(".json").toString();
    return getOpaqueJsonString(classLoader, path);
}