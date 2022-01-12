private java.lang.String encodeWord(java.lang.String word) {
    java.lang.String result = "";
    for (int i = 0; i < (word.length()); i++) {
        result = result + (encodeChar(word.substring(i, (i + 1))));
    }
    return result;
}