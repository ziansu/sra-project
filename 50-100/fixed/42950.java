public void start(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    super.start(context);
    org.talend.commons.utils.workbench.extensions.IExtensionPointLimiter extensionPointLimiter = new org.talend.commons.utils.workbench.extensions.ExtensionPointLimiterImpl("org.talend.designer.runprocess.runprocess_manager", "runprocess_manager");
    runProcessContextManager = new org.talend.designer.runprocess.RunProcessContextManager();
    runProcessContextManagerList = org.talend.commons.utils.workbench.extensions.ExtensionImplementationProvider.getInstance(extensionPointLimiter);
    runProcessContextManagerList.add(runProcessContextManager);
}