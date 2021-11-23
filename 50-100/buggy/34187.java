@java.lang.Override
protected boolean updateSelection(org.eclipse.jface.viewers.IStructuredSelection selection) {
    if ((!(super.updateSelection(selection))) || (selection.isEmpty())) {
        return false;
    }
    for (java.util.Iterator i = getSelectedResources().iterator(); i.hasNext();) {
        org.eclipse.core.resources.IResource r = ((org.eclipse.core.resources.IResource) (i.next()));
        if (!(r.isAccessible())) {
            return false;
        }
    }
    return true;
}