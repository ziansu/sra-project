public void parray(int[][] a) {
    java.lang.String retstr = "";
    for (int i = 0; i < (a.length); i++) {
        for (int j = 0; j < (a[0].length); j++) {
            retstr += (a[i][j]) + " ";
        }
        retstr += "\n";
    }
}