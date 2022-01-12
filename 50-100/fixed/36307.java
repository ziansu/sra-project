private void startBody(final java.lang.String s, int tempIndex) {
    currentArticle.startBody();
    tempIndex += tools.DocumentParser.TAG_BODY_OPENED.length();
    currentArticle.appendText(((s.substring(tempIndex, ((tempIndex = s.indexOf(tools.DocumentParser.TAG_BODY_CLOSED)) != (-1) ? tempIndex : s.length()))) + "\n"));
    if (s.contains(tools.DocumentParser.TAG_BODY_CLOSED)) {
        currentArticle.finishBody();
    }
}