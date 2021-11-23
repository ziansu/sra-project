protected java.util.Collection<java.lang.String> sampleFileContent(final org.eclipse.emf.common.util.URI corpusPath, final java.lang.String... fileEndings) {
    org.corpus_tools.pepper.impl.CorpusPathResolver localPathResolver = corpusPathResolver;
    if (localPathResolver == null) {
        try {
            localPathResolver = new org.corpus_tools.pepper.impl.CorpusPathResolver(corpusPath);
        } catch (java.io.FileNotFoundException e) {
            new org.corpus_tools.pepper.modules.exceptions.PepperModuleException("Cannot sample files for isImportable. ", e);
        }
    }
    return localPathResolver.sampleFileContent(fileEndings);
}