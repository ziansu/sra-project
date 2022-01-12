public static java.lang.String stringAlignment(java.lang.String x, java.lang.String y) {
    DynamicProgramming.scoreTable = new Cell[(y.length()) + 1][(x.length()) + 1];
    DynamicProgramming.initializeScoreTable();
    DynamicProgramming.fillInScoreTable(x, y);
    java.lang.String[] alignments = ((java.lang.String[]) (DynamicProgramming.getTraceback(x, y)));
    return alignments[1];
}