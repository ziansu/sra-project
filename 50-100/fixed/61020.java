private void updateDimensions() {
    if ((columnWidths) == null) {
        return ;
    }
    this.numberOfColumns = columnWidths.length;
    this.unusableWidth = ((numberOfColumns) * (columnSpacing)) + (((numberOfColumns) * 2) * (cellPadding));
}