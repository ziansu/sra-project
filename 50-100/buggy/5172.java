public boolean isPositionValid(final int columnIndex, final int rowIndex) {
    if ((rowIndex < 0) || (rowIndex > (boundingBox.getHeight()))) {
        return false;
    }
    if ((columnIndex < 0) || (columnIndex > (boundingBox.getWidth()))) {
        return false;
    }
    return true;
}