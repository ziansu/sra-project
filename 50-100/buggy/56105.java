private void setGapToken() {
    de.hu_berlin.german.korpling.saltnpepper.salt.saltCommon.sDocumentStructure.SToken temp_tok = null;
    temp_tok = sDocGraph.createSToken(primaryText, primaryText.getSEnd(), primaryText.getSEnd());
    for (int i = 0; !(getSAnnoStack().isEmpty()); i++) {
        createTokenAnnoSpan(temp_tok, getSAnnoStack().peek());
        temp_tok.addSAnnotation(getSAnnoStack().pop());
    }
    setDominatingToken(temp_tok);
    push_spans(temp_tok);
}