public static boolean isPlaceTaken(java.lang.String column, java.lang.String row) {
    int columnNum = java.lang.Integer.parseInt(column);
    int rowNum = java.lang.Integer.parseInt(row);
    if ((service.FieldVisualizer.currentField[rowNum][columnNum]) == 0) {
        return false;
    }else {
        return true;
    }
}