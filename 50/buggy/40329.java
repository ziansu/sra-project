public int getSortedRowIndex(final com.notlob.jgrid.model.Row<T> row) {
    final int index = java.util.Collections.binarySearch(gridModel.getRows(), row, rowComparator);
    return (index * (-1)) - 1;
}