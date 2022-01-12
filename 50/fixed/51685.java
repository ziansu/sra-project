public boolean ifQuestion(java.lang.String statement) {
    isThisAQuestion = false;
    java.lang.String word = getFirstWord(statement).toLowerCase();
    if (indicators.contains(word))
        isThisAQuestion = true;
    
    return isThisAQuestion;
}