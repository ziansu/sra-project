public java.lang.String translate(java.lang.String text) {
    java.lang.String[] words = text.split("\\s+");
    for (int i = 0; i < (words.length); i++) {
        words[i] = wordTranslator.translateWord(words[i]);
    }
    java.lang.String res = java.util.Arrays.stream(words).collect(java.util.stream.Collectors.joining(" "));
    return res;
}