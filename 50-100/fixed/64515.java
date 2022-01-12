public int stringCompareToList(java.lang.String input, java.lang.String[] keywordsInInput) {
    if ((input != null) && (keywordsInInput != null)) {
        for (int i = 0; i < (keywordsInInput.length); i++) {
            if (keywordsInInput[i].equalsIgnoreCase(input)) {
                return i;
            }
        }
    }
    return -1;
}