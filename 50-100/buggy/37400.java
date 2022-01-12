@java.lang.Override
public void validate(cc.redpen.model.Sentence sentence) {
    java.lang.String content = sentence.getContent();
    int commaCount = 0;
    int position = 0;
    while (position != (-1)) {
        position = content.indexOf(this.comma);
        commaCount++;
        content = content.substring((position + 1), content.length());
    } 
    if ((getMaxNum()) < commaCount) {
        addLocalizedError(sentence, commaCount, getMaxNum());
    }
}