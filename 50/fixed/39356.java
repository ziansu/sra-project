@org.junit.Test
public void run() throws java.lang.Throwable {
    org.apache.uima.analysis_engine.AnalysisEngineDescription aed = org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription(de.tudarmstadt.ukp.dkpro.core.clearnlp.ClearNlpSegmenter.class);
    de.tudarmstadt.ukp.dkpro.core.testing.harness.SegmenterHarness.run(aed, "de.1", "de.2", "de.3", "de.4", "en.1", "en.7", "en.9", "ar.1", "zh.1", "zh.2");
}