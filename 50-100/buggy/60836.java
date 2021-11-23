private java.lang.String calc(java.lang.String input) {
    int i = 0;
    java.lang.String modString = "";
    while (i <= (input.length())) {
        modString = modString + ((input.charAt(i)) + 1);
        i++;
    } 
    return modString;
}