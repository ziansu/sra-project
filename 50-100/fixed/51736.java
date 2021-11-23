public boolean generate() throws java.io.IOException {
    if ((((this.fileName) == null) || ((this.replacementContent) == null)) || ((this.coverLetterTemplate) == null)) {
        return false;
    }
    if (!(coverLetterTemplate.exists())) {
        return false;
    }
    java.lang.String content = replaceKeywords(replacementContent);
    buildCoverLetter(fileName, coverLetterTemplate, content);
    return true;
}