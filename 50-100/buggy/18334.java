protected void fireSelectionChanged(org.eclipse.jface.viewers.ISelection selection) {
    final org.eclipse.jface.viewers.SelectionChangedEvent event = new org.eclipse.jface.viewers.SelectionChangedEvent(this, selection);
    java.lang.Object[] listeners = selectionChangedListeners.getListeners();
    for (int i = 0; i < (listeners.length); ++i) {
        final org.eclipse.jface.viewers.ISelectionChangedListener l = ((org.eclipse.jface.viewers.ISelectionChangedListener) (listeners[i]));
        org.eclipse.core.runtime.SafeRunner.run(new org.eclipse.jface.util.SafeRunnable() {
            public void run() {
                l.selectionChanged(event);
            }
        });
    }
}