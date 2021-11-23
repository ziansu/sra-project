protected boolean isLeafMatch(final org.eclipse.jface.viewers.Viewer viewer, final java.lang.Object element) {
    org.eclipse.jface.viewers.TreeViewer treeViewer = ((org.eclipse.jface.viewers.TreeViewer) (viewer));
    int numberOfColumns = treeViewer.getTree().getColumnCount();
    org.eclipse.jface.viewers.ITableLabelProvider labelProvider = ((org.eclipse.jface.viewers.ITableLabelProvider) (treeViewer.getLabelProvider()));
    boolean isMatch = false;
    for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) {
        java.lang.String labelText = labelProvider.getColumnText(element, columnIndex);
        isMatch |= wordMatches(labelText);
    }
    return isMatch;
}