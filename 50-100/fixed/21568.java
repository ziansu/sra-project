public static java.lang.String stringAlignment(java.lang.String x, java.lang.String y) {
    DynamicProgramming.scoreTable = new Cell[(y.length()) + 1][(x.length()) + 1];
    DynamicProgramming.initializeScoreTable();
    DynamicProgramming.fillInScoreTable(x, y);
    return DynamicProgramming.getTraceback(x, y);
}