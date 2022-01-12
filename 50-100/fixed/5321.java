private void moveVisibleChildren(final com.notlob.jgrid.model.Row<T> row) {
    final java.util.List<com.notlob.jgrid.model.Row<T>> children = getChildren(row);
    for (com.notlob.jgrid.model.Row<T> child : children) {
        if (child.isVisible()) {
            rows.remove(child);
            final int newExpectedIndex = sortModel.getSortedRowIndex(child);
            rows.add(newExpectedIndex, child);
            child.setRowIndex(newExpectedIndex);
        }
    }
}