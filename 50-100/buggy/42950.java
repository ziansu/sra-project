public void start(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    super.start(context);
    org.talend.commons.utils.workbench.extensions.IExtensionPointLimiter extensionPointLimiter = new org.talend.commons.utils.workbench.extensions.ExtensionPointLimiterImpl("org.talend.designer.runprocess.runprocess_manager", "runprocess_manager");
    runProcessContextManagerList = org.talend.commons.utils.workbench.extensions.ExtensionImplementationProvider.getInstance(extensionPointLimiter);
    runProcessContextManager = ((runProcessContextManagerList.size()) > 0) ? runProcessContextManagerList.get(0) : null;
    if ((runProcessContextManager) == null) {
        runProcessContextManager = new org.talend.designer.runprocess.RunProcessContextManager();
    }
}