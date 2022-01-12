protected boolean isPluginWizardFragmentEnabled() {
    com.liferay.ide.eclipse.project.core.IPortletFramework portletFramework = this.portletPluginPage.getSelectedPortletFramework();
    if (portletFramework != null) {
        com.liferay.ide.eclipse.project.ui.IPortletFrameworkDelegate delegate = getPortletFrameworkDelegate(portletFramework.getId());
        if (((delegate != null) && ((delegate.getWizardFragment()) != null)) && (delegate.isFragmentEnabled())) {
            return true;
        }
    }
    return false;
}