@java.lang.Override
protected org.eclipse.swt.widgets.Control createContents(org.eclipse.swt.widgets.Composite parent) {
    if (isPropertyPage()) {
        profile = getRegistry().getResourceProfileWorkingCopy(((org.eclipse.core.resources.IResource) (getElement())));
    }else {
        profile = getRegistry().getWorkspaceProfile();
    }
    org.eclipse.swt.widgets.Composite comp = ((org.eclipse.swt.widgets.Composite) (super.createContents(parent)));
    createInfoControl(comp);
    return comp;
}