static boolean Expression9(com.intellij.lang.PsiBuilder b, int l) {
    if (!(com.intellij.lang.parser.GeneratedParserUtilBase.recursion_guard_(b, l, "Expression9")))
        return false;
    
    boolean r;
    com.intellij.lang.PsiBuilder.Marker m = com.intellij.lang.parser.GeneratedParserUtilBase.enter_section_(b);
    r = com.neueda.jetbrains.plugin.graphdb.language.cypher.parser.CypherParser.Expression9_0(b, (l + 1));
    if (!r)
        r = com.neueda.jetbrains.plugin.graphdb.language.cypher.parser.CypherParser.Expression8(b, (l + 1));
    
    com.intellij.lang.parser.GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
}