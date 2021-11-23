private org.eclipse.swt.widgets.Control createLowerPart(org.eclipse.swt.widgets.Composite parent) {
    org.eclipse.swt.widgets.Composite frame = new org.eclipse.swt.widgets.Composite(parent, org.eclipse.swt.SWT.NONE);
    frame.setLayout(com.eclipsesource.example.ece2011.ui.admin.AdminUI.createGridLayout());
    org.eclipse.swt.widgets.Label headerLabel = new org.eclipse.swt.widgets.Label(frame, org.eclipse.swt.SWT.NONE);
    headerLabel.setText("Available UI Contributions");
    headerLabel.setData(WidgetUtil.CUSTOM_VARIANT, "header");
    contributionsTree = createTree(frame, SWT.BORDER);
    contributionsTree.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.FILL, org.eclipse.swt.SWT.TOP, true, false));
    return frame;
}