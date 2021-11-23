public static java.lang.String convertArrayToSeperatedString(java.lang.String[] inBetweens, char divider) {
    java.lang.String outputString = "";
    for (int i = 0; i < (inBetweens.length); i++) {
        if (i == 0) {
            outputString = (outputString + (inBetweens[i])) + divider;
        }else {
            outputString = (outputString + divider) + (inBetweens[i]);
        }
    }
    return outputString;
}