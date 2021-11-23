private java.lang.String trimInput(java.lang.String input) {
    while ((input.charAt(0)) == '(')
        input = input.substring(1);
    
    while ((input.charAt(((input.length()) - 1))) == ')')
        input = input.substring(((input.length()) - 1));
    
    return input;
}