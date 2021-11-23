public java.lang.String[] getRawWords() {
    java.lang.String[] result = new java.lang.String[wordArray.length];
    for (int wordIndex = 0; wordIndex < (wordArray.length); wordIndex++) {
        result[wordIndex] = vocabulary.getWordFromIndex(wordIndex);
    }
    return result;
}