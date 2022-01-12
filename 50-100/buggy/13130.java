private static void merge(java.lang.String[] rowFrom, java.lang.String[] rowTo) {
    for (int i = 0; i < (rowTo.length); i++) {
        if ((i < (rowTo.length)) && ((rowTo[i]) == null)) {
            rowTo[i] = rowFrom[i];
        }
    }
}