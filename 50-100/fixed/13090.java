public static boolean differByOne(java.lang.String word, java.lang.String ladderLast) {
    if ((word.length()) != (ladderLast.length())) {
        return false;
    }
    int count = 0;
    for (int i = 0; i < (word.length()); i++) {
        if ((word.charAt(i)) != (ladderLast.charAt(i))) {
            count++;
        }
    }
    return count == 1;
}