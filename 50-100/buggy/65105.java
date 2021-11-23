public static int countWords(java.util.List<java.lang.String> words, char c, char d, int len) {
    return ((int) (words.stream().filter(( word) -> word.contains((c + ""))).filter(( word) -> !(word.contains((d + "")))).count()));
}