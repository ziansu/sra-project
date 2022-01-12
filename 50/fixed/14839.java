private boolean parseCaseStatement() {
    com.intellij.lang.PsiBuilder.Marker mark = b.mark();
    match(glslplugin.lang.parser.CASE_KEYWORD, "Expected 'case'");
    parseConstantExpression();
    match(glslplugin.lang.parser.COLON, "Expected ':'");
    mark.done(glslplugin.lang.parser.CASE_STATEMENT);
    return true;
}