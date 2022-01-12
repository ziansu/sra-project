public static java.lang.String replace(java.lang.String word, char gone, char here) {
    char[] stringArray = word.toCharArray();
    for (int i = 0; i < (stringArray.length); i++) {
        if ((stringArray[i]) == gone) {
            stringArray[i] = here;
        }
    }
    return new java.lang.String(stringArray);
}