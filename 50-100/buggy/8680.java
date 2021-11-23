public void createContent(org.eclipse.swt.widgets.Composite parent) {
    createImages(parent.getDisplay());
    parent.setLayout(com.eclipsesource.example.ece2011.ui.admin.AdminUI.createMainLayout());
    org.eclipse.swt.widgets.Control upperPart = createUpperPart(parent);
    upperPart.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.FILL, org.eclipse.swt.SWT.TOP, true, false));
    org.eclipse.swt.widgets.Control lowerPart = createLowerPart(parent);
    lowerPart.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.FILL, org.eclipse.swt.SWT.TOP, true, false));
    changeTracker = new com.eclipsesource.example.ece2011.ui.admin.AdminUI.UiChangeTracker();
    changeTracker.start();
}