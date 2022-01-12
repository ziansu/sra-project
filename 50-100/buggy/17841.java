protected org.apache.uima.analysis_engine.AnalysisEngineDescription getPreprocessing(boolean useCoarse) throws org.apache.uima.resource.ResourceInitializationException {
    java.util.List<org.apache.uima.analysis_engine.AnalysisEngineDescription> preprocessing = new java.util.ArrayList<>();
    preprocessing.add(org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription(de.unidue.ltl.flextag.core.uima.TcPosTaggingWrapper.class, TcPosTaggingWrapper.PARAM_USE_COARSE_GRAINED, useCoarse));
    if ((userPreprocessing) != null) {
        preprocessing.addAll(java.util.Arrays.asList(userPreprocessing));
    }
    return org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription(preprocessing.toArray(new org.apache.uima.analysis_engine.AnalysisEngineDescription[0]));
}