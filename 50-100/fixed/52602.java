private edu.stanford.nlp.fsm.DFSA<java.lang.String, java.lang.Integer> getViterbiSearchGraph(java.util.List<IN> doc, java.lang.Class<? extends edu.stanford.nlp.ling.CoreAnnotation<java.lang.String>> answerField) {
    if (doc.isEmpty()) {
        return new edu.stanford.nlp.fsm.DFSA(null);
    }
    edu.stanford.nlp.ie.ObjectBankWrapper<IN> obw = new edu.stanford.nlp.ie.ObjectBankWrapper(flags, null, knownLCWords);
    doc = obw.processDocument(doc);
    edu.stanford.nlp.ie.SequenceModel model = getSequenceModel(doc);
    return edu.stanford.nlp.ie.ViterbiSearchGraphBuilder.getGraph(model, classIndex);
}