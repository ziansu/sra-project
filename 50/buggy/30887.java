private java.lang.String calc(java.lang.String input) {
    if ((input.length()) > 2)
        return input.substring(2, input.length).concat(input.substring(0, 2));
    
    return input;
}