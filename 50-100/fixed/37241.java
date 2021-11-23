public static void iterationSearchStart(artificial_bee_colony.Configuration cfg) {
    if (ResultParser.ResultParser.isDeepResultTest) {
        java.util.Arrays.fill(ResultParser.ResultParser.comparisonCounts, 0);
        ResultParser.ResultParser.comparisons.clear();
        java.util.Arrays.fill(ResultParser.ResultParser.levyCounts, 0);
        ResultParser.ResultParser.improvementsLevy.clear();
        ResultParser.ResultParser.colonyFitnesses.clear();
        ResultParser.ResultParser.paretoFrontSize.clear();
        ResultParser.ResultParser.currentParetoFrontSize = 0;
    }
}