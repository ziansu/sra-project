public java.lang.String toString() {
    java.lang.String pastureStr = "";
    for (int row = 0; row < (rows); row++) {
        java.lang.String rowStr = "";
        for (int col = 0; col < (cols); col++) {
            rowStr += (pasture1[row][col]) + "\t";
        }
        pastureStr += rowStr + "\n";
    }
    return pastureStr;
}