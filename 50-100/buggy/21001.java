public java.lang.String array2DToString(java.lang.String[][] a) {
    java.lang.String output = "";
    for (int i = 0; i < (a.length); i++) {
        for (int j = 0; j < (a[i].length); j++) {
            output += (a[i][j]) + " ";
        }
        output += "\n";
    }
    return output;
}