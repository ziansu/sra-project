protected void activate(org.osgi.service.component.ComponentContext context) {
    org.wso2.carbon.identity.data.publisher.audit.user.operation.impl.UserOperationDataPublisher handler = new org.wso2.carbon.identity.data.publisher.audit.user.operation.impl.UserOperationDataPublisher();
    context.getBundleContext().registerService(org.wso2.carbon.identity.event.handler.AbstractEventHandler.class.getName(), handler, null);
}