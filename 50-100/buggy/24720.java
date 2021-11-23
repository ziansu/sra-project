public java.lang.String toStringPasture() {
    java.lang.String pastureStr = "";
    for (int row = 0; row < (rows); row++) {
        java.lang.String rowStr = "";
        for (int col = 0; col < (cols); col++) {
            rowStr += (pasture1[row][col]) + ' ';
        }
        pastureStr = rowStr + '\n';
    }
    return pastureStr;
}