public void addSplitAnnotation() throws gate.util.InvalidOffsetException {
    int end = seq_anot.lastEndInt();
    if (end > 0)
        end--;
    
    int start = end;
    if ((start > 0) && (czsem.gate.externalannotator.Annotator.isEndPunctuationChar(seq_anot.charAt((start - 1)))))
        start--;
    
    as.add(((long) (start)), ((long) (end)), "Split", gate.Factory.newFeatureMap());
}