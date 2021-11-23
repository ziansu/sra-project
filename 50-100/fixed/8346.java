private static java.lang.String getRequiredSpaces(java.lang.String reference, java.lang.String message) {
    java.lang.String res = "";
    int requiredSpaces = ((reference.length()) - (message.length())) - 4;
    for (int i = 0; i < requiredSpaces; i++) {
        res = res + " ";
    }
    return res;
}