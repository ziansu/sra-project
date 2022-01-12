public void split_query(java.lang.String query) {
    words = query.replaceAll("[^A-Za-z0-9 ]", " ").split("\\s+");
    for (int i = 0; i < (words.length); i++) {
        words[i] = words[i].replaceAll("[^\\w]", "");
    }
}