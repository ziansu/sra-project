private void moveVisibleChildren(com.notlob.jgrid.model.Row<T> row) {
    final java.util.List<com.notlob.jgrid.model.Row<T>> children = getChildren(row);
    for (com.notlob.jgrid.model.Row<T> child : children) {
        if (child.isVisible()) {
            rows.remove(child);
            final int newExpectedIndex = java.lang.Math.abs(sortModel.getSortedRowIndex(child));
            rows.add(newExpectedIndex, child);
            row.setRowIndex(newExpectedIndex);
        }
    }
}