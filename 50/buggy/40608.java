@org.junit.Test
public void testEmpty() throws org.apache.uima.analysis_engine.AnalysisEngineProcessException, org.apache.uima.resource.ResourceInitializationException {
    org.apache.uima.jcas.JCas jCas = createNewJCasWithText("Test String");
    org.apache.uima.analysis_engine.JCasIterator it = de.tudarmstadt.ukp.dkpro.tc.core.io.ClassificationUnitCasMultiplierTest.engine.processAndOutputNewCASes(jCas);
    org.junit.Assert.assertEquals("The JCasIterator should not have CASes", false, it.hasNext());
}