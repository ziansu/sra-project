public java.lang.String translateSentence(java.lang.String sentence, boolean isEnglish) {
    java.lang.String translation = "";
    java.lang.String[] words = sentence.split(" ");
    for (java.lang.String word : words) {
        translation += " " + (translateWord(word, isEnglish));
    }
    return translation;
}