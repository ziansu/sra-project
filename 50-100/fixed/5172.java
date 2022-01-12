public boolean isPositionValid(final int columnIndex, final int rowIndex) {
    if ((rowIndex < 0) || (rowIndex > ((boundingBox.getHeight()) - 1))) {
        return false;
    }
    if ((columnIndex < 0) || (columnIndex > ((boundingBox.getWidth()) - 1))) {
        return false;
    }
    return true;
}