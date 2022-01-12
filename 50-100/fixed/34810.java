private boolean IsColumnFull(Core.Board board, int columnIndex) throws java.lang.Exception {
    try {
        if ((columnIndex < 0) || (columnIndex > 6)) {
            return true;
        }
        for (int i = 0; i < 6; i++) {
            if ((board.GetValueAt(columnIndex, i)) == 0) {
                return false;
            }
        }
        return true;
    } catch (java.lang.Exception e) {
        throw new java.lang.Exception(e);
    }
}