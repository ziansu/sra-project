private org.eclipse.swt.widgets.Control createUpperPart(org.eclipse.swt.widgets.Composite parent) {
    org.eclipse.swt.widgets.Composite frame = new org.eclipse.swt.widgets.Composite(parent, org.eclipse.swt.SWT.NONE);
    frame.setLayout(com.eclipsesource.example.ece2011.ui.admin.AdminUI.createGridLayout());
    org.eclipse.swt.widgets.Label headerLabel = new org.eclipse.swt.widgets.Label(frame, org.eclipse.swt.SWT.NONE);
    headerLabel.setText("Deployed UI Contributions");
    headerLabel.setData(WidgetUtil.CUSTOM_VARIANT, "header");
    portsTabFolder = new org.eclipse.swt.widgets.TabFolder(frame, org.eclipse.swt.SWT.TOP);
    portsTabFolder.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.FILL, org.eclipse.swt.SWT.FILL, true, true));
    createTabItemsForPorts();
    return frame;
}