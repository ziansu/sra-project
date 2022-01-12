private static java.lang.String getRequiredSpaces(java.lang.String message) {
    java.lang.String res = "";
    final java.lang.String reference = "#########################################################################";
    int requiredSpaces = ((reference.length()) - (message.length())) - 4;
    for (int i = 0; i < requiredSpaces; i++) {
        res = res + " ";
    }
    return res;
}