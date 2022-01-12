@java.lang.Override
public void validate(cc.redpen.model.Section section) {
    int sectionCharNumber = 0;
    for (cc.redpen.model.Paragraph currentParagraph : section.getParagraphs()) {
        for (cc.redpen.model.Sentence sentence : currentParagraph.getSentences()) {
            sectionCharNumber += sentence.getContent().length();
        }
    }
    if (sectionCharNumber > (getInt("max_num"))) {
        addLocalizedError(section.getJoinedHeaderContents(), sectionCharNumber);
    }
}