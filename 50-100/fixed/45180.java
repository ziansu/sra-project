public java.util.ArrayList<java.lang.String> splitText(java.lang.String text) {
    java.util.ArrayList<java.lang.String> words = new java.util.ArrayList<java.lang.String>();
    int pos = 0;
    while ((text.indexOf(' ', pos)) > 0) {
        int nextPos = text.indexOf(' ', pos);
        java.lang.String word = text.substring(pos, nextPos);
        pos = nextPos + 1;
        words.add(word);
    } 
    words.add(text.substring(pos));
    return words;
}