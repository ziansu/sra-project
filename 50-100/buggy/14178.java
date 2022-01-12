private void parseEditStartTime(java.lang.String userInput, java.util.ArrayList<java.lang.String> editTaskElements) {
    java.lang.System.out.println("Debug at parseEditStartTime ");
    INDEX_OF_LAST_FROM = editTaskElements.lastIndexOf(KEYWORD_FROM);
    contentToAnalyse = new java.util.ArrayList<java.lang.String>(editTaskElements.subList(INDEX_OF_LAST_FROM, editTaskElements.size()));
    setNewTaskName(userInput.substring(0, userInput.lastIndexOf(KEYWORD_FROM)));
    java.util.List<java.util.Date> dates = new org.ocpsoft.prettytime.nlp.PrettyTimeParser().parse(toStringTaskElements(contentToAnalyse));
    setNewStartDate(dates.get(0));
}