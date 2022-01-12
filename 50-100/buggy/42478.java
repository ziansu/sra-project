private java.lang.String loadComponentJSonSchema(java.lang.ClassLoader classLoader, java.lang.String scheme, java.lang.String javaType) {
    java.lang.String path = null;
    int pos = javaType.lastIndexOf(".");
    path = javaType.substring(0, pos);
    path = path.replace('.', '/');
    path = ((path + "/") + scheme) + ".json";
    return getOpaqueJsonString(classLoader, path);
}