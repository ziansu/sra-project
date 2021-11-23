private void parseEditStartTime(java.lang.String userInput) {
    java.lang.System.out.println("Debug at parseEditStartTime ");
    INDEX_OF_LAST_FROM = userInput.lastIndexOf(KEYWORD_FROM);
    java.lang.String temp = userInput.substring(INDEX_OF_LAST_FROM, userInput.length());
    setNewTaskName(userInput.substring(0, userInput.lastIndexOf(KEYWORD_FROM)));
    java.util.List<java.util.Date> dates = new org.ocpsoft.prettytime.nlp.PrettyTimeParser().parse(temp);
    setNewStartDate(dates.get(0));
}