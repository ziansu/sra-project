private void parseEditEndTime(java.util.ArrayList<java.lang.String> editTaskElements) {
    INDEX_OF_LAST_TO = editTaskElements.lastIndexOf(KEYWORD_TO);
    contentToAnalyse = new java.util.ArrayList<java.lang.String>(editTaskElements.subList(INDEX_OF_LAST_TO, editTaskElements.size()));
    newDate = parser.analysePossibleDateElements(contentToAnalyse);
    setNewEndDate(newDate);
}