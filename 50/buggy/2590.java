public java.lang.String readString(il.co.topq.report.Configuration.ConfigProps prop) {
    final java.lang.String value = configProperties.getProperty(prop.getPropName());
    if (null == value) {
        return prop.getDefaultValue();
    }
    return value;
}