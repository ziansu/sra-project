public static java.lang.String convertArrayToSeperatedString(java.lang.String[] inBetweens, char divider) {
    java.lang.String outputString = "";
    for (int i = 0; i < (inBetweens.length); i++) {
        if (i == ((inBetweens.length) - 1)) {
            outputString = outputString + (inBetweens[i]);
        }else {
            outputString = (outputString + (inBetweens[i])) + divider;
        }
    }
    return outputString;
}