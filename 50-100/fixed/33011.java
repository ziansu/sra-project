private void initialize(java.lang.String brownPath) throws dkpro.toolbox.corpus.CorpusException {
    try {
        reader = org.apache.uima.fit.factory.CollectionReaderFactory.createReaderDescription(de.tudarmstadt.ukp.dkpro.core.io.tei.TeiReader.class, TeiReader.PARAM_LANGUAGE, dkpro.toolbox.corpus.BrownCorpus.LANGUAGE, TeiReader.PARAM_SOURCE_LOCATION, brownPath, TeiReader.PARAM_PATTERNS, "*.xml.gz");
    } catch (org.apache.uima.resource.ResourceInitializationException e) {
        throw new dkpro.toolbox.corpus.CorpusException(e);
    }
}