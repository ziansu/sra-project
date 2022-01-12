public int convertModelToView(final int columnIndex) {
    if (columnIndex != (-1)) {
        return modelToView[columnIndex];
    }else {
        return columnIndex;
    }
}