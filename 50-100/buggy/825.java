@java.lang.Override
public void validate(cc.redpen.model.Section section) {
    for (cc.redpen.model.Paragraph currentParagraph : section.getParagraphs()) {
        if ((currentParagraph.getNumberOfSentences()) == 0) {
            continue;
        }
        cc.redpen.model.Sentence firstSentence = currentParagraph.getSentence(0);
        if ((firstSentence.getContent().indexOf(getString("start_from"))) != 0) {
            addLocalizedError(section.getJoinedHeaderContents(), firstSentence.getContent().charAt(0));
        }
    }
}