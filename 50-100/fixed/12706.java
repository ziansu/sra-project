public boolean isEveryCharacterUniqueUsingHistogram() {
    int[] asciiCount = new int[128];
    for (int i = 0; i < (string.length()); i++) {
        (asciiCount[string.charAt(i)])++;
    }
    for (int i = 0; i < (asciiCount.length); i++) {
        if ((asciiCount[i]) > 1) {
            return false;
        }
    }
    return true;
}