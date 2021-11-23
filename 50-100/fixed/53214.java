public void collectSentences(java.net.URL u, java.lang.String kw, java.util.List<java.lang.String> sentences) {
    if (sentences != null) {
        java.lang.String strUrl = u.toString();
        java.lang.String strSentences = sentences.stream().map(( s) -> ("\"" + s) + "\"").reduce(( s1, s2) -> (s1 + ", ") + s2).orElse("");
        print(java.lang.String.format("The word %s occurs in sentences %s on page %s", kw, strSentences, strUrl));
    }
}