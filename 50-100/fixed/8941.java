private java.lang.String extractTag(java.lang.String noteContent) {
    java.lang.String[] contentWords = noteContent.split(" ");
    java.lang.String label = null;
    for (java.lang.String word : contentWords) {
        if ((word.startsWith("#")) && ((word.length()) > 1)) {
            label = word.substring(1);
            break;
        }
    }
    return label;
}