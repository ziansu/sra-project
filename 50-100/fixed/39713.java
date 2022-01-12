public java.lang.Object invoke(final org.aopalliance.intercept.MethodInvocation invocation) throws java.lang.Throwable {
    java.lang.Object retObject = invocation.proceed();
    if ((!(isLoaded)) && (null == retObject)) {
        com.alfresco.orm.AlfrescoORM alfrescoORM = ((com.alfresco.orm.AlfrescoORM) (invocation.getThis()));
        org.alfresco.service.cmr.repository.NodeRef nodeRef = com.alfresco.orm.ORMUtil.getNodeRef(alfrescoORM);
        com.alfresco.orm.ObjectFillHelper.getObjectFillHelper().getFilledObject(nodeRef, alfrescoORM, true);
        isLoaded = true;
        retObject = invocation.proceed();
    }
    return retObject;
}