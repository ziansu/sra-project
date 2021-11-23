static boolean Expression10(com.intellij.lang.PsiBuilder b, int l) {
    if (!(recursion_guard_(b, l, "Expression10")))
        return false;
    
    boolean r;
    com.intellij.lang.PsiBuilder.Marker m = enter_section_(b);
    r = com.neueda.jetbrains.plugin.graphdb.language.cypher.parser.CypherParser.Expression9(b, (l + 1));
    r = r && (com.neueda.jetbrains.plugin.graphdb.language.cypher.parser.CypherParser.Expression10_1(b, (l + 1)));
    exit_section_(b, m, null, r);
    return r;
}