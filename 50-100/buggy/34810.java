private boolean IsColumnFull(Core.Board board, int columnIndex) throws java.lang.Exception {
    try {
        if ((columnIndex < 1) || (columnIndex > 7)) {
            throw new java.lang.Exception("ColumnIndex is not in the range of 1 to 7");
        }
        for (int i = 0; i < 6; i++) {
            if ((board.GetValueAt(i, columnIndex)) == 0) {
                return false;
            }
        }
        return true;
    } catch (java.lang.Exception e) {
        throw new java.lang.Exception(e);
    }
}