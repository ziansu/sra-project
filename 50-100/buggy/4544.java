public boolean attack(navalbattle.Matrix matrix, int row, java.lang.String col) {
    try {
        int column = matrix.getColumn(col);
        if ((matrix.get(row, column)) == null) {
            return false;
        }
        matrix.set("X", row, column);
        return true;
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        return false;
    }
}