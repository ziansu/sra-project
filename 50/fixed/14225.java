public void setParameterValue(int index, double value) {
    int row = index % (rowDimension);
    int col = index / (rowDimension);
    super.setParameterValue(row, col, value);
}