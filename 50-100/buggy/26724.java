public void showPath() {
    java.lang.System.out.println("-------------------------------------------------------\n");
    for (int i = 0; i < (nblin); i++) {
        for (int j = 0; j < (nbcol); j++) {
            java.lang.System.out.print((" | " + (path[i][j])));
        }
        java.lang.System.out.println(" | ");
    }
    java.lang.System.out.print("--------------------------------------------------------\n");
}