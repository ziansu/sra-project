@org.junit.Test(expected = org.apache.uima.analysis_engine.AnalysisEngineProcessException.class)
public void testEmpty() throws org.apache.uima.analysis_engine.AnalysisEngineProcessException, org.apache.uima.resource.ResourceInitializationException {
    org.apache.uima.jcas.JCas jCas = createNewJCasWithText("Test String");
    de.tudarmstadt.ukp.dkpro.tc.core.io.ClassificationUnitCasMultiplierTest.engine.processAndOutputNewCASes(jCas);
}