@java.lang.Override
public void splitSample(java.lang.String file, java.lang.String tagger) {
    super.splitSample(file, tagger);
    extraction.Splitter s = new extraction.SplitterNegra(sampleLines, tagger);
    s.split();
}