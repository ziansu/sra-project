@java.lang.Override
protected org.eclipse.core.runtime.IStatus doExecute(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) {
    org.mdmi.uml.profile.MDMIMapping mdmiMapping = org.eclipse.uml2.uml.util.UMLUtil.getStereotypeApplication(modelElement, org.mdmi.uml.profile.MDMIMapping.class);
    if (mdmiMapping != null) {
        int itemCtr = 0;
        for (org.eclipse.swt.widgets.TableItem ti : table.getItems()) {
            org.mdmi.uml.profile.MappedElement me = mdmiMapping.getElements().get((itemCtr++));
            me.setModelElementPath(ti.getText(0));
            me.setCondition(ti.getText(2));
        }
    }
    return org.eclipse.core.runtime.Status.OK_STATUS;
}