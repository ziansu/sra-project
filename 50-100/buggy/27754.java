@java.lang.Override
public void createPartControl(org.eclipse.swt.widgets.Composite parent) {
    org.eclipse.ui.IWorkbench workbench = org.eclipse.ui.PlatformUI.getWorkbench();
    org.eclipse.swt.graphics.Color whiteColor = workbench.getDisplay().getSystemColor(SWT.COLOR_WHITE);
    parent.setBackground(whiteColor);
    browser = new org.eclipse.swt.browser.Browser(parent, org.eclipse.swt.SWT.NONE);
    org.eclipse.swt.layout.FillLayout layout = new org.eclipse.swt.layout.FillLayout();
    browser.setLayoutData(layout);
    addKeyListener();
}