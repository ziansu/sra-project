void switchTwoColumns(int columnIndex, int columnToIndex) {
    for (int i = 0; i < ((com.cleveroad.adaptivetablelayout.BaseDataAdaptiveTableLayoutAdapter.getRowCount()) - 1); i++) {
        java.lang.Object cellData = getItems()[i][columnToIndex];
        getItems()[i][columnToIndex] = getItems()[i][columnIndex];
        getItems()[i][columnIndex] = cellData;
    }
}