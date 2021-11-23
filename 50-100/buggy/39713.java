public java.lang.Object invoke(org.aopalliance.intercept.MethodInvocation invocation) throws java.lang.Throwable {
    if (isLoaded) {
        com.alfresco.orm.AlfrescoORM alfrescoORM = ((com.alfresco.orm.AlfrescoORM) (invocation.getThis()));
        org.alfresco.service.cmr.repository.NodeRef nodeRef = com.alfresco.orm.ORMUtil.getNodeRef(alfrescoORM);
        com.alfresco.orm.ObjectFillHelper.getObjectFillHelper().getFilledObject(nodeRef, alfrescoORM, true);
    }
    java.lang.Object retObject = invocation.proceed();
    isLoaded = true;
    return retObject;
}