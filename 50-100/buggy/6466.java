private static java.lang.String printHorizontalLine(java.lang.String toPrint, java.lang.String n) {
    if (n == null) {
        return "";
    }
    int iterator = java.lang.Integer.parseInt(n);
    for (int i = 0; i < iterator; i++) {
        toPrint += "*";
    }
    return toPrint;
}