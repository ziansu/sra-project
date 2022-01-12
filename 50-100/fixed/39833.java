public java.lang.StringBuilder printField(java.lang.String[][] field) {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    for (int j = 0; j < (controller.getRow()); j++) {
        for (int i = 0; i < (controller.getColumn()); i++) {
            result.append(field[i][j]).append(" ");
        }
        result.append("\n");
    }
    return result;
}