public static java.lang.String multiparse_morse(java.lang.String input) {
    java.lang.String result = "";
    for (int i = 0; i < (input.length()); i++) {
        if ((input.charAt(i)) == ' ') {
            result += "/";
        }else {
            result += Parser.parse_morse(input.charAt(i));
        }
    }
    return result;
}