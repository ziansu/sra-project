public java.lang.String inflectNoun(java.lang.String nounLemma, java.lang.String inflection) {
    java.lang.String toRet = "";
    ballpark.WordElement word = lexicon.getWord(nounLemma, LexicalCategory.NOUN);
    if (inflection.contains("def")) {
        if (inflection.contains("plu")) {
            ballpark.InflectedWordElement pluralWord = new ballpark.InflectedWordElement(word);
            pluralWord.setPlural(true);
            toRet = realiser.realise(pluralWord).toString();
        }
        if (toRet != null)
            return "the " + toRet;
        
    }
    return nounLemma;
}