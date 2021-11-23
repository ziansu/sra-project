private java.lang.String getLine(int number) throws java.lang.Exception {
    java.lang.String value = null;
    java.lang.String pageContent = FitnesseFixtureContext.page.getHtml();
    java.lang.String lineizedContent = fitnesse.fixtures.ResponseExaminer.convertBreaksToLineSeparators(pageContent);
    java.util.StringTokenizer tokenizedLines = tokenizeLines(lineizedContent);
    for (int i = number; i != 0; i--)
        value = tokenizedLines.nextToken();
    
    return value.trim();
}