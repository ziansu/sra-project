public static java.lang.String getLastWords(java.lang.String string, int n) {
    java.lang.String[] split = string.split(" ");
    java.lang.String words = "";
    for (int i = (split.length) - n; i < (split.length); i++) {
        if (i == ((split.length) - n))
            words += (split[i]) + " ";
        
    }
    return words;
}