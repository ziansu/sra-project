@java.lang.Override
protected void handleSelectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent event) {
    org.eclipse.jface.viewers.IStructuredSelection sel = ((org.eclipse.jface.viewers.IStructuredSelection) (event.getSelection()));
    updateActionBars(sel);
    linkToEditor(sel);
}