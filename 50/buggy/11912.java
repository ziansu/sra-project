@java.lang.SuppressWarnings(value = { "RedundantThrows" , "UnusedParameters" })
protected void deactivate(org.osgi.service.component.ComponentContext cc) throws java.lang.Exception {
    java.lang.System.out.println("MongoDB Bundle Shutting down");
    if (org.wso2.carbon.identity.user.store.mongodb.userstoremanager.internal.MongoDBUserStoreDSComponent.log.isDebugEnabled()) {
        org.wso2.carbon.identity.user.store.mongodb.userstoremanager.internal.MongoDBUserStoreDSComponent.log.debug("MongoDB User Store Manager is deactivated ");
    }
}