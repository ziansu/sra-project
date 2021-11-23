public java.util.Collection<logic.Question> getDistinctQuestions(int count) throws database.exceptions.UnknownLanguageException, org.basex.core.BaseXException {
    java.util.List<java.lang.String> allLanguageNames = getValidLanguageNames();
    java.util.Collections.shuffle(allLanguageNames);
    for (java.lang.String s : allLanguageNames) {
        allLanguageNames.add(s);
    }
    java.util.Collections.shuffle(allLanguageNames);
    java.util.List<logic.Question> questionData = new java.util.ArrayList<>(count);
    for (java.lang.String languageName : allLanguageNames.subList(0, count)) {
        questionData.add(buildQuestionData(languageName));
    }
    return questionData;
}