@java.lang.Override
public void process(org.apache.uima.jcas.JCas aJCas) throws org.apache.uima.analysis_engine.AnalysisEngineProcessException {
    try (java.io.OutputStream docOS = getOutputStream(aJCas, ".json")) {
        jcs.serialize(aJCas.getCas(), docOS);
        if ((!(typeSystemWritten)) || ((typeSystemFile) == null)) {
            writeTypeSystem(aJCas);
            typeSystemWritten = true;
        }
    } catch (java.lang.Exception e) {
        throw new org.apache.uima.analysis_engine.AnalysisEngineProcessException(e);
    }
}