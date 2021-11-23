public void print() {
    for (int i = 1; i < (rows); i++) {
        for (int j = 0; j < (columns); j++) {
            java.lang.System.out.print(((counters[i][j]) + " "));
        }
        java.lang.System.out.println();
    }
}