private boolean isNextAcronym(char c, char nc) {
    return ((java.lang.Character.isLowerCase(c)) && (java.lang.Character.isUpperCase(nc))) || ((java.lang.Character.isLetter(c)) && (java.lang.Character.isLetter(nc)));
}