public void printField() {
    for (int i = 0; i < (field.length); i++) {
        for (int j = 0; j < (field[i].length); j++) {
            java.lang.System.out.print((("[" + (field[i][j])) + "]"));
        }
        java.lang.System.out.println("\n");
    }
    java.lang.System.out.println("\n");
}