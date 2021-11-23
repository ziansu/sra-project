private static org.eclipse.swt.widgets.Composite createPageComposite(final org.eclipse.swt.widgets.Composite parent) {
    final org.eclipse.swt.widgets.Composite composite = new org.eclipse.swt.widgets.Composite(parent, org.eclipse.swt.SWT.NULL);
    composite.setLayout(new org.eclipse.swt.layout.GridLayout(1, false));
    composite.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.FILL, org.eclipse.swt.SWT.FILL, true, true));
    return composite;
}