@java.lang.Override
public java.lang.String getInactiveEventPublisherConfigurationContent(java.lang.String filename) throws org.wso2.carbon.event.publisher.core.exception.EventPublisherConfigurationException {
    return org.wso2.carbon.event.publisher.core.internal.util.helper.EventPublisherConfigurationFilesystemInvoker.readEventPublisherConfigurationFile(filename);
}