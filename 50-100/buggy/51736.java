public boolean generate() {
    if (!(this.coverLetterTemplate.exists())) {
        return false;
    }
    java.lang.String content = replaceKeywords(this.replacementContent);
    try {
        buildCoverLetter(this.fileName, this.coverLetterTemplate, content);
    } catch (java.io.IOException e) {
        java.lang.System.err.println("Cover Letter generation failed");
        e.printStackTrace();
        return false;
    }
    return true;
}