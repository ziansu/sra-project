private java.lang.String calc(java.lang.String input) {
    if ((input.length()) == 1) {
        return input;
    }
    char first = input.charAt(0);
    char second = input.charAt(1);
    java.lang.String toReturn = "";
    for (int i = 2; i < (input.length()); i++) {
        toReturn += input.charAt(i);
    }
    toReturn = (toReturn + first) + second;
    return toReturn;
}