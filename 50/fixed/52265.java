public static int isNumber(java.lang.String n) throws instructions.Parser.SyntaxError {
    try {
        return java.lang.Integer.parseInt(n.trim());
    } catch (java.lang.NumberFormatException e) {
        throw new instructions.Parser.SyntaxError(java.lang.String.format("** error, expected an integer but got \'%s\'\n", n));
    }
}