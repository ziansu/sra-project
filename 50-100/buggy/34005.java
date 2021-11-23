private boolean hasDeadLined(java.lang.String userInput) {
    java.util.List<java.util.Date> dates = new org.ocpsoft.prettytime.nlp.PrettyTimeParser().parse(userInput);
    if ((((userInput.contains(KEYWORD_BEFORE)) || (userInput.contains(KEYWORD_BY))) || (userInput.contains(KEYWORD_ON))) || (userInput.contains(KEYWORD_AT))) {
        return (dates.size()) == 0 ? true : false;
    }else {
        return false;
    }
}