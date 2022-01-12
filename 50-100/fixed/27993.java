private java.lang.String trimLeft(java.lang.String str) {
    int i = 0;
    char[] ch = str.toCharArray();
    while ((java.lang.Character.isWhitespace(ch[i])) && (i < ((ch.length) - 1))) {
        i++;
    } 
    return str.substring(i);
}