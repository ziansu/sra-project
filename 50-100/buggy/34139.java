public int[] selectAllButEveryNthPosition(int order) {
    int rowCount = getPositionsModel().getRowCount();
    int[] indices = slash.navigation.gui.events.Range.allButEveryNthAndFirstAndLast(rowCount, order);
    selectPositions(indices);
    return new int[]{ indices.length , rowCount - (indices.length) };
}