@java.lang.Override
public java.lang.String getInactiveEventPublisherConfigurationContent(java.lang.String filename) throws org.wso2.carbon.event.publisher.core.exception.EventPublisherConfigurationException {
    validateFilePath(filename);
    return org.wso2.carbon.event.publisher.core.internal.util.helper.EventPublisherConfigurationFilesystemInvoker.readEventPublisherConfigurationFile(filename);
}