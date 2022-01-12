private void addImplementation(org.eclipse.core.resources.IResourceDelta pDelta, org.libreoffice.ide.eclipse.core.model.IUnoidlProject pUnoProject) {
    java.lang.String className = isJavaServiceImpl(pDelta.getResource());
    if (className != null) {
        if (org.libreoffice.ide.eclipse.java.registration.RegistrationHelper.isFileEmpty(pUnoproj)) {
            org.libreoffice.ide.eclipse.core.PluginLogger.error(org.libreoffice.ide.eclipse.java.Messages.getString("RegistrationHelper.ReadClassesListError"));
        }else {
            org.libreoffice.ide.eclipse.java.registration.RegistrationHelper.addImplementation(pUnoProject, className);
        }
    }
}