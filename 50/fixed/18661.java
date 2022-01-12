private java.lang.String cleanUpString(java.lang.String searchWord) {
    if (searchWord != null) {
        searchWord.trim();
        while (searchWord.contains(" ")) {
            searchWord.replace(" ", "+");
        } 
        return searchWord;
    }
    return null;
}