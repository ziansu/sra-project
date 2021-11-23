public static java.lang.String leftPad(java.lang.String base, char character, int padding) {
    java.lang.String paddingString = "";
    for (int i = 0; i <= ((base.length()) - padding); i++)
        paddingString += character;
    
    return paddingString + base;
}