private static char getLastLetter(Proposition P) {
    Proposition prop = P;
    java.lang.String propType = prop.getType();
    char lastLetter = propType.charAt(((propType.length()) - 1));
    return lastLetter;
}