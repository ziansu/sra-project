@java.lang.Override
public void visitToken(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    final java.lang.String literal = ast.getText();
    if ((hasUnicodeChar(literal)) && (!(((((allowByTailComment) && (haastrailComment(ast))) || (isAllCharactersEscaped(literal))) || ((allowEscapesForControlCharacters) && (isOnlyUnicodeValidChars(literal, com.puppycrawl.tools.checkstyle.checks.AvoidEscapedUnicodeCharactersCheck.sUnicodeControl)))) || ((allowNonPrintableEscapes) && (isOnlyUnicodeValidChars(literal, com.puppycrawl.tools.checkstyle.checks.AvoidEscapedUnicodeCharactersCheck.sNonPrintableChars)))))) {
        log(ast.getLineNo(), "forbid.escaped.unicode.char");
    }
}