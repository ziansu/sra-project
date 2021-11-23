@java.lang.Override
public void collectionProcessComplete() throws org.apache.uima.analysis_engine.AnalysisEngineProcessException {
    super.collectionProcessComplete();
    applyFilter();
    writeOutcomes();
    writeFeatureNames();
    if (isTesting) {
        applyFeatureNameFilter();
    }
    try {
        dsw.transform(outputDirectory, (!(featureStore.supportsSparseFeatures())), learningMode, applyWeighting);
    } catch (java.lang.Exception e) {
        throw new org.apache.uima.analysis_engine.AnalysisEngineProcessException(e);
    }
}