@java.lang.Override
public java.lang.String cleanTranslation(java.lang.String sourceWord) {
    java.lang.String wordToClean = sourceWord.toLowerCase();
    for (java.lang.String rule : removeRegexRules) {
        wordToClean = wordToClean.replaceAll(rule, "");
    }
    return wordToClean.trim();
}