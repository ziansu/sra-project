@java.lang.Override
protected boolean updateSelection(org.eclipse.jface.viewers.IStructuredSelection selection) {
    if ((!(super.updateSelection(selection))) || (selection.isEmpty())) {
        return false;
    }
    for (org.eclipse.core.resources.IResource r : getSelectedResources()) {
        if (!(r.isAccessible())) {
            return false;
        }
    }
    return true;
}