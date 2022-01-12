public static org.apache.hadoop.conf.Configuration injectSystemProperties(org.apache.hadoop.conf.Configuration conf) {
    for (java.lang.String propName : java.lang.System.getProperties().stringPropertyNames()) {
        if (propName.startsWith("hadoop.")) {
            conf.set(propName.substring("hadoop.".length()), java.lang.System.getProperty(propName));
        }
    }
    return conf;
}