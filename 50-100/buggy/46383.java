@java.lang.Override
public java.lang.String apply(final java.lang.String input) {
    java.lang.String res = "";
    for (int i = 0; i < (input.length()); i++) {
        final char testChar = input.charAt(i);
        if ((java.lang.Character.isLowerCase(testChar)) || (testChar == '_')) {
            res += testChar;
        }else {
            res += "^" + testChar;
        }
    }
    return res;
}