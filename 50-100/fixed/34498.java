@java.lang.Override
@java.lang.SuppressWarnings(value = "rawtypes")
public java.lang.Object getAdapter(java.lang.Class adapter) {
    if (org.eclipse.buildship.ui.viewer.FilteredTree.class.equals(adapter)) {
        return getPageControl();
    }else
        if (adapter.isAssignableFrom(org.eclipse.jface.viewers.TreeViewer.class)) {
            return getPageControl().getViewer();
        }
    
    return org.eclipse.core.runtime.Platform.getAdapterManager().getAdapter(this, adapter);
}