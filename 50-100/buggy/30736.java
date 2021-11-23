public java.lang.String translate(java.lang.String sentences) {
    java.lang.String[] words = sentences.split("\\s+");
    for (int i = 0; i < (words.length); i++) {
        words[i] = wordTranslator.translateWord(words[i]);
    }
    java.lang.String res = java.util.Arrays.stream(words).collect(java.util.stream.Collectors.joining(" "));
    return res;
}