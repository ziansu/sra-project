public static void updateRegressionTestCases(fr.inria.astor.core.setup.ProjectRepairFacade projectConfig) {
    java.util.List<java.lang.String> original = projectConfig.getProperties().getRegressionTestCases();
    java.util.List<java.lang.String> refined = fr.inria.astor.core.setup.FinderTestCases.refineListofRegressionTestCases(original);
    if (!(refined.isEmpty()))
        projectConfig.getProperties().setRegressionCases(refined);
    
    fr.inria.astor.core.setup.FinderTestCases.log.debug(((("Refining list of test cases: original= " + (original.size())) + ", refined= ") + (refined.size())));
}