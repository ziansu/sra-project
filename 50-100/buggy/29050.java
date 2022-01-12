public static boolean isPlaceTaken(java.lang.String column, java.lang.String row) {
    int columnNum = java.lang.Integer.parseInt(column);
    int rowNum = java.lang.Integer.parseInt(row);
    if ((service.FieldVisualizer.currentField[((columnNum * 2) - 1)][((rowNum * 2) - 1)]) == 4) {
        return false;
    }else {
        return true;
    }
}