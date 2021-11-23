public static java.util.List<java.lang.String> getPropertyAsList(java.lang.String key) {
    java.util.List<java.lang.String> properties = new java.util.ArrayList<>();
    for (java.lang.Object object : com.github.invictum.utils.properties.PropertiesUtil.config.getList(key, null)) {
        properties.add(((java.lang.String) (object)));
    }
    return properties;
}