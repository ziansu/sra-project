private static java.util.Map<java.lang.String, edu.washington.cs.dt.RESULT> getCurrentOrderTestListResults(java.util.List<java.lang.String> currentOrderTestList, java.util.List<java.lang.String> filesToDelete) {
    edu.washington.cs.dt.impact.tools.FileTools.clearEnv(filesToDelete);
    edu.washington.cs.dt.TestExecResults results = edu.washington.cs.dt.main.ImpactMain.getResults(currentOrderTestList);
    return results.getExecutionRecords().get(0).getNameToResultsMap();
}