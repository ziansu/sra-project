protected void runTrainTest(org.dkpro.lab.task.ParameterSpace pSpace, java.lang.Class<? extends org.dkpro.tc.core.ml.TCMachineLearningAdapter> machineLearningAdapter) throws java.lang.Exception {
    final org.dkpro.tc.ml.ExperimentTrainTest batch = new org.dkpro.tc.ml.ExperimentTrainTest("BrownTrainTestBatchTask", machineLearningAdapter);
    batch.setParameterSpace(pSpace);
    ContextMemoryReport.adapter = machineLearningAdapter.getName();
    batch.addReport(org.dkpro.tc.examples.single.sequence.ContextMemoryReport.class);
    batch.addReport(org.dkpro.tc.ml.report.BatchTrainTestReport.class);
    batch.setExecutionPolicy(ExecutionPolicy.RUN_AGAIN);
    org.dkpro.lab.Lab.getInstance().run(batch);
}