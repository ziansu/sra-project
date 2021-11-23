public static java.util.List<com.quollwriter.text.Word> getAsWords(java.lang.String l) {
    if (l == null) {
        return null;
    }
    return new com.quollwriter.text.Sentence(l, new com.quollwriter.text.DialogueInd()).getWords();
}