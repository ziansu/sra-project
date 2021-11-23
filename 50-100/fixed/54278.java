@java.lang.Override
public void createPartControl(org.eclipse.swt.widgets.Composite parent) {
    preferences = InstanceScope.INSTANCE.getNode(Notepad4e.PLUGIN_ID);
    preferences.addPreferenceChangeListener(this);
    noteTabsFolder = new org.eclipse.swt.custom.CTabFolder(parent, ((org.eclipse.swt.SWT.MULTI) | (org.eclipse.swt.SWT.WRAP)));
    restoreViewFromPreviousSession();
    listenToTabClosing();
    org.eclipse.ui.PlatformUI.getWorkbench().getHelpSystem().setHelp(noteTabsFolder, "Notepad4e.viewer");
    makeActions();
    contributeToActionBars();
}