@java.lang.Override
public void createTabs(org.eclipse.debug.ui.ILaunchConfigurationDialog dialog, java.lang.String mode) {
    org.eclipse.debug.ui.ILaunchConfigurationTab[] tabs = new org.eclipse.debug.ui.ILaunchConfigurationTab[]{ new org.eclipse.debug.ui.CommonTab() };
    setTabs(tabs);
}