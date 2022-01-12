@java.lang.Override
public void process(org.apache.uima.jcas.JCas aJCas) throws org.apache.uima.analysis_engine.AnalysisEngineProcessException {
    try (java.io.OutputStream docOS = getOutputStream(aJCas, ".xmi")) {
        org.apache.uima.cas.impl.XmiCasSerializer.serialize(aJCas.getCas(), null, docOS, prettyPrint, null);
        if (!(typeSystemWritten)) {
            writeTypeSystem(aJCas);
            typeSystemWritten = true;
        }
    } catch (java.lang.Exception e) {
        throw new org.apache.uima.analysis_engine.AnalysisEngineProcessException(e);
    }
}