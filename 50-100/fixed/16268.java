protected boolean isLeafMatch(final org.eclipse.jface.viewers.Viewer viewer, final java.lang.Object element) {
    int numberOfColumns = ((org.eclipse.jface.viewers.TreeViewer) (viewer)).getTree().getColumnCount();
    org.eclipse.jface.viewers.ITableLabelProvider labelProvider = ((org.eclipse.jface.viewers.ITableLabelProvider) (((org.eclipse.jface.viewers.TreeViewer) (viewer)).getLabelProvider()));
    boolean isMatch = false;
    for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) {
        java.lang.String labelText = labelProvider.getColumnText(element, columnIndex);
        isMatch |= wordMatches(labelText);
    }
    return isMatch;
}