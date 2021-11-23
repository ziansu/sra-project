@java.lang.Override
protected org.eclipse.swt.widgets.Control createDialogArea(final org.eclipse.swt.widgets.Composite parent) {
    final org.eclipse.swt.widgets.Composite container = ((org.eclipse.swt.widgets.Composite) (super.createDialogArea(parent)));
    final org.eclipse.swt.browser.Browser browser = new org.eclipse.swt.browser.Browser(container, ((org.eclipse.swt.SWT.BORDER) | (org.eclipse.swt.SWT.MOZILLA)));
    browser.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.layout.GridData.FILL_BOTH));
    browser.addLocationListener(this);
    browser.setUrl(source);
    return container;
}