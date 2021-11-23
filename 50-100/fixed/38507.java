@java.lang.Override
public myhealthylife.sentencegenerator.model.Sentence readRandomSentence() {
    java.util.List<myhealthylife.sentencegenerator.model.Sentence> sentenceList = this.readSentenceListPublic().getSentence();
    if (!(sentenceList.isEmpty())) {
        myhealthylife.sentencegenerator.model.Sentence selectedSentence = sentenceList.get(((int) (this.getRandomLong(sentenceList.size()))));
        return selectedSentence;
    }
    return null;
}