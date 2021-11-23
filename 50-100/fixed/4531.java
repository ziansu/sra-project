private java.lang.String removeFrontSideAudio(java.lang.String answerContent) {
    java.lang.String answerFormat = getAnswerFormat();
    if (answerFormat.contains("{{FrontSide}}")) {
        java.lang.String frontSideFormat = mCurrentCard._getQA(false).get("q");
        java.util.regex.Matcher audioReferences = Sound.sSoundPattern.matcher(frontSideFormat);
        while (audioReferences.find()) {
            answerContent = answerContent.replaceFirst(audioReferences.group(), "");
        } 
    }
    return answerContent;
}