@java.lang.Override
protected org.eclipse.swt.widgets.Control createContents(org.eclipse.swt.widgets.Composite parent) {
    profile = (isPropertyPage()) ? getRegistry().getResourceProfileWorkingCopy(((org.eclipse.core.resources.IResource) (getElement()))) : getRegistry().getWorkspaceProfile();
    org.eclipse.swt.widgets.Composite comp = ((org.eclipse.swt.widgets.Composite) (super.createContents(parent)));
    createInfoControl(comp);
    return comp;
}