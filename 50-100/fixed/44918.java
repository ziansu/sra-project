private java.lang.String calc(java.lang.String input) {
    char[] charArray = input.toCharArray();
    for (int i = 0; i < (charArray.length); i++) {
        charArray[i] = ((char) ((charArray[i]) + 1));
    }
    return new java.lang.String(charArray);
}