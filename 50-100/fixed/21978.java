protected org.eclipse.swt.widgets.Control createDialogArea(org.eclipse.swt.widgets.Composite parent) {
    final org.eclipse.swt.widgets.Composite dialogArea = ((org.eclipse.swt.widgets.Composite) (super.createDialogArea(parent)));
    final org.eclipse.swt.widgets.Composite container = new org.eclipse.swt.widgets.Composite(dialogArea, org.eclipse.swt.SWT.NULL);
    container.setLayout(new org.eclipse.swt.layout.FillLayout());
    container.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.FILL, org.eclipse.swt.SWT.FILL, true, true));
    container.setSize(500, 500);
    createChart(container);
    return dialogArea;
}