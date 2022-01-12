@java.lang.Override
public void createPartControl(org.eclipse.swt.widgets.Composite parent) {
    viewer = new au.gov.ansto.bragg.bilby.ui.internal.BilbyWorkflowViewer(parent, org.eclipse.swt.SWT.NONE);
    org.eclipse.jface.layout.GridDataFactory.fillDefaults().applyTo(viewer);
}