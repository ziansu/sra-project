private java.lang.String calc(java.lang.String input) {
    java.lang.String temp = "";
    for (int i = 0; i < (str.length()); i++) {
        temp = temp + ((char) ((str.charAt(i)) + 1));
    }
    return temp;
}