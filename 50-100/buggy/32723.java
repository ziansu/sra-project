public static org.apache.stratos.common.statistics.publisher.ThriftClientConfig getInstance() {
    if ((org.apache.stratos.common.statistics.publisher.ThriftClientConfig.instance) == null) {
        synchronized(org.apache.stratos.common.statistics.publisher.ThriftClientConfig.class) {
            if ((org.apache.stratos.common.statistics.publisher.ThriftClientConfig.instance) == null) {
                java.lang.String defaultConfigFilePath = ((java.lang.System.getProperty(org.apache.stratos.common.statistics.publisher.ThriftClientConfig.CARBON_HOME)) + (org.apache.stratos.common.statistics.publisher.ThriftClientConfig.REPOSITORY_CONF)) + (org.apache.stratos.common.statistics.publisher.ThriftClientConfig.THRIFT_CLIENT_CONFIG_FILE_NAME);
                java.lang.String configFilePath = java.lang.System.getProperty(org.apache.stratos.common.statistics.publisher.ThriftClientConfig.THRIFT_CLIENT_CONFIG_FILE_PATH, defaultConfigFilePath);
                org.apache.stratos.common.statistics.publisher.ThriftClientConfig.instance = org.apache.stratos.common.statistics.publisher.ThriftClientConfigParser.parse(configFilePath);
            }
        }
    }
    return org.apache.stratos.common.statistics.publisher.ThriftClientConfig.instance;
}