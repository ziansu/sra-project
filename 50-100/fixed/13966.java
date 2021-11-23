@java.lang.Override
public java.lang.String getProperty(java.lang.String key) {
    java.lang.String val = ((java.lang.String) (statics.get(key)));
    if (val != null) {
        return val;
    }
    val = ((java.lang.String) (systemProperties.get(key)));
    if (val != null) {
        return val;
    }
    val = ((java.lang.String) (systemEnvironment.get(key)));
    return val;
}