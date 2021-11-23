public void createPartControl(org.eclipse.swt.widgets.Composite parent) {
    this.parentcomp = parent;
    activator = xstampp.stpapriv.Activator.getDefault();
    graph = new org.eclipse.zest.core.widgets.Graph(parent, org.eclipse.swt.SWT.NONE);
}