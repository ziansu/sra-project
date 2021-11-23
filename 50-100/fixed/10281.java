@java.lang.Override
public org.apache.metron.common.configuration.extensions.ParserExtensionConfig findOneParserExtension(java.lang.String name) throws org.apache.metron.rest.RestException {
    org.apache.metron.common.configuration.extensions.ParserExtensionConfig parserExtensionConfig;
    try {
        parserExtensionConfig = org.apache.metron.common.configuration.ConfigurationsUtils.readParserExtensionConfigFromZookeeper(name, client);
    } catch (org.apache.zookeeper.KeeperException e) {
        return null;
    } catch (java.lang.Exception e) {
        org.apache.metron.rest.service.impl.ExtensionServiceImpl.LOG.error("Error reading ParserExtensionConfig from Zookeeper", e);
        throw new org.apache.metron.rest.RestException(e);
    }
    return parserExtensionConfig;
}