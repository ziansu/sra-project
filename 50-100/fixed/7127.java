private java.lang.String arrayToString(char[][] array) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < (array.length); i++) {
        for (int j = 0; j < (array[0].length); j++) {
            sb.append(array[i][j]);
        }
        sb.append("\n");
    }
    return sb.toString();
}