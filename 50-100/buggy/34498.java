@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public <T> T getAdapter(java.lang.Class<T> adapter) {
    if (org.eclipse.buildship.ui.viewer.FilteredTree.class.equals(adapter)) {
        return ((T) (getPageControl()));
    }else
        if (adapter.isAssignableFrom(org.eclipse.jface.viewers.TreeViewer.class)) {
            return ((T) (getPageControl().getViewer()));
        }
    
    return org.eclipse.core.runtime.Platform.getAdapterManager().getAdapter(this, adapter);
}