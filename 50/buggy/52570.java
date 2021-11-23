@java.lang.Override
protected de.tudarmstadt.ukp.dkpro.core.decompounding.dictionary.Dictionary produceResource(java.io.InputStream aStream) throws java.lang.Exception {
    return new de.tudarmstadt.ukp.dkpro.core.decompounding.dictionary.German98Dictionary(aStream, new java.io.ByteArrayInputStream(affixModelProvider.getResource().getBytes()));
}