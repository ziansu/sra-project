@java.lang.Override
public void createPartControl(org.eclipse.swt.widgets.Composite parent) {
    parent.setLayoutData(new org.eclipse.swt.layout.FillLayout());
    org.eclipse.swt.custom.SashForm sashForm = new org.eclipse.swt.custom.SashForm(parent, org.eclipse.swt.SWT.HORIZONTAL);
    planSashForm = new org.eclipse.swt.custom.SashForm(sashForm, org.eclipse.swt.SWT.VERTICAL);
    createTreeViewer(planSashForm);
    matchesTabFolder = new org.eclipse.swt.custom.CTabFolder(planSashForm, org.eclipse.swt.SWT.MULTI);
    createZestViewer(sashForm);
}