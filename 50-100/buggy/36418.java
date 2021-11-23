boolean parseCaseStatement() {
    com.intellij.lang.PsiBuilder.Marker m = enter_section_modified(builder);
    net.masterthought.dlanguage.parser.Token colon = expect(net.masterthought.dlanguage.parser.DLangParser.tok(":"));
    if (colon == null) {
        cleanup(m);
        return false;
    }
    if (!(parseDeclarationsAndStatements())) {
        cleanup(m);
        return false;
    }
    com.intellij.lang.parser.GeneratedParserUtilBase.exit_section_(builder, m, net.masterthought.dlanguage.parser.CASE_STATEMENT, true);
    return true;
}