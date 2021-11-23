private void readTest() throws java.io.IOException {
    int maxExamples = getMaxExamplesForGroup("test");
    java.util.List<edu.stanford.nlp.sempre.thingtalk.Example> examples = getOrCreateGroup("test");
    if ((edu.stanford.nlp.sempre.thingtalk.ThingpediaDataset.opts.testFile) == null)
        return ;
    
    readFromFile(maxExamples, examples, edu.stanford.nlp.sempre.thingtalk.ThingpediaDataset.opts.testFile);
}