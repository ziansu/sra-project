public void generateSentenceObjectFromUnlabeledTokens(java.lang.String[] tokens) {
    data.Sentence sentence = new data.Sentence(tokens.length);
    for (int i = 0; i < (tokens.length); i++) {
        sentence.addNextToken(i, updateWordMap(tokens[i]), (-1));
    }
    this.setSentence(sentence);
    (this.sentenceCnt)++;
}