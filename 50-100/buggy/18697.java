static java.util.List<java.lang.String> configListProperty(java.lang.String fileName, java.lang.String propertyName, java.lang.String defaultValue) {
    java.util.Properties serverProperties = vn.com.solution.ntq.glastool.utils.PropertiesLoader.load(fileName);
    java.lang.String property = serverProperties.getProperty(propertyName, defaultValue).replaceAll(" ", "");
    java.util.List<java.lang.String> list = java.util.Arrays.asList(property.split(vn.com.solution.ntq.glastool.config.ConfigMethod.ROW_SEPARATOR));
    return list;
}