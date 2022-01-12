public void addEntries(interQA.lexicon.Lexicon lexicon, interQA.lexicon.LexicalEntry.POS pos, java.lang.String frame) {
    this.index = lexicon.getSubindex(pos, frame, true);
}