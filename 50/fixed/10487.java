private java.lang.String getTextAtIndex(int index, caevo.SieveSentence sent) {
    edu.stanford.nlp.ling.CoreLabel cl = sent.tokens().get((index - 1));
    return cl.originalText();
}