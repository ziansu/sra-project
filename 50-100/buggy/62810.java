@java.lang.Override
public java.util.List<java.lang.String> getAllParserExtensionTypes() throws org.apache.metron.rest.RestException {
    java.util.List<java.lang.String> types;
    try {
        types = client.getChildren().forPath(ConfigurationType.PARSER_EXTENSION.getZookeeperRoot());
    } catch (org.apache.zookeeper.KeeperException e) {
        org.apache.metron.rest.service.impl.ExtensionServiceImpl.LOG.error("No Node reading Parser Extension Types from Zookeeper", e);
        types = new java.util.ArrayList<>();
    } catch (java.lang.Exception e) {
        org.apache.metron.rest.service.impl.ExtensionServiceImpl.LOG.error("Error reading Parser Extension Types from Zookeeper", e);
        throw new org.apache.metron.rest.RestException(e);
    }
    return types;
}