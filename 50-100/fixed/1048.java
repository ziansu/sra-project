private void executeSaveModelIntoTemporyFolder(de.tudarmstadt.ukp.dkpro.lab.task.ParameterSpace aPSpace, java.io.File aModelFolder) throws java.lang.Exception {
    de.tudarmstadt.ukp.dkpro.tc.crfsuite.task.serialization.SaveModelCRFSuiteBatchTask batch = new de.tudarmstadt.ukp.dkpro.tc.crfsuite.task.serialization.SaveModelCRFSuiteBatchTask("TestSaveModel", aModelFolder, de.tudarmstadt.ukp.dkpro.tc.crfsuite.CRFSuiteAdapter.class);
    batch.setParameterSpace(aPSpace);
    batch.setExecutionPolicy(ExecutionPolicy.RUN_AGAIN);
    de.tudarmstadt.ukp.dkpro.lab.Lab.getInstance().run(batch);
}