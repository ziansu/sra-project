public static voldemort.utils.Props getPropsFromJob(org.apache.hadoop.conf.Configuration conf) {
    java.lang.String propsString = conf.get("azkaban.props");
    if (propsString == null)
        throw new voldemort.utils.UndefinedPropertyException("The required property azkaban.props was not found in the Configuration.");
    
    try {
        java.io.ByteArrayInputStream input = new java.io.ByteArrayInputStream(propsString.getBytes("UTF-8"));
        java.util.Properties properties = new java.util.Properties();
        properties.load(input);
        return new voldemort.utils.Props(null, properties);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException("This is not possible!", e);
    }
}