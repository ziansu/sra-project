protected java.lang.String removeYesterday(java.lang.String userInput) {
    java.util.List<java.util.Date> dates = new org.ocpsoft.prettytime.nlp.PrettyTimeParser().parse(userInput);
    if ((userInput.contains(KEYWORD_YESTERDAY)) && ((dates.size()) != 0)) {
        userInput = userInput.replace(KEYWORD_YESTERDAY, "");
        possibleDate = KEYWORD_YESTERDAY;
    }
    return userInput.trim();
}