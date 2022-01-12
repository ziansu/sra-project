public java.lang.String translateSentencePlain(java.lang.String sent, tehthu.parser.Direction d) {
    tehthu.parser.Rope r = sanitizeAndRope(sent, d);
    tehthu.parser.Rope translated = translate(r, d);
    return translated.getText(false);
}