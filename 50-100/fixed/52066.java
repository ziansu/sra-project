public java.lang.String toString() {
    java.lang.String f = ("%- " + ((getLongestValue()) + 3)) + ".2f ";
    java.lang.String res = "";
    for (int r = 0; r < (rows); r++) {
        for (int c = 0; c < (columns); c++) {
            res += java.lang.String.format(f, contents[r][c]);
        }
        res += "\n";
    }
    return res;
}