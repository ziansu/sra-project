protected void runTrainTest(org.dkpro.lab.task.ParameterSpace pSpace) throws java.lang.Exception {
    org.dkpro.tc.ml.ExperimentTrainTest batch = new org.dkpro.tc.ml.ExperimentTrainTest("BrownPosDemoCV_Mallet", org.dkpro.tc.mallet.MalletAdapter.class);
    batch.setPreprocessing(getPreprocessing());
    batch.setParameterSpace(pSpace);
    batch.setExecutionPolicy(ExecutionPolicy.RUN_AGAIN);
    batch.addReport(org.dkpro.tc.ml.report.BatchTrainTestReport.class);
    batch.addReport(org.dkpro.tc.mallet.report.MalletAccuracyReport.class);
    org.dkpro.lab.Lab.getInstance().run(batch);
}