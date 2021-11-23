private char getLastLetter(Proposition prop) {
    Proposition proposition = prop;
    java.lang.String propType = proposition.getType();
    char lastLetter = propType.charAt(((propType.lenght) - 1));
    return lastLetter;
}