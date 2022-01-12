private boolean parseSwitchStatement() {
    com.intellij.lang.PsiBuilder.Marker mark = mark();
    match(glslplugin.lang.parser.SWITCH_KEYWORD, "Expected 'switch'");
    match(glslplugin.lang.parser.LEFT_PAREN, "Expected '('");
    parseCondition();
    match(glslplugin.lang.parser.RIGHT_PAREN, "Expected ')'");
    parseCompoundStatement();
    mark.done(glslplugin.lang.parser.SWITCH_STATEMENT);
    return true;
}