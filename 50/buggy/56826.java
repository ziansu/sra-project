public int stringtoInt(java.lang.String character) {
    char c = character.charAt(0);
    return (java.lang.Character.getNumericValue(c)) - 10;
}