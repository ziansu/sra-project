public static org.corpus_tools.salt.common.SCorpusGraph createCorpusStructure_simple() {
    org.corpus_tools.salt.common.SCorpusGraph corpGraph = org.corpus_tools.salt.SaltFactory.createSCorpusGraph();
    corpGraph.createDocument(org.corpus_tools.salt.samples.SampleGenerator.doc1);
    return corpGraph;
}