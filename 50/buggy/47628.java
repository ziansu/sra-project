private java.lang.String getMlcpOptionsFilePath(java.lang.String entityName, java.lang.String flowName) {
    return (((((("." + (java.io.File.separator)) + (com.marklogic.hub.config.EnvironmentConfiguration.MLCP_OPTIONS_DIR)) + (java.io.File.separator)) + entityName) + "-") + flowName) + ".txt";
}