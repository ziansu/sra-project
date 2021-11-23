public static java.lang.String normalizeUpperCaseString(java.lang.String upperCasedString) {
    if (upperCasedString == null) {
        return "";
    }
    upperCasedString = upperCasedString.trim();
    if ((upperCasedString.length()) < 2) {
        return upperCasedString.toLowerCase();
    }
    return (upperCasedString.substring(0, 1)) + (upperCasedString.substring(1, upperCasedString.length()).toLowerCase());
}