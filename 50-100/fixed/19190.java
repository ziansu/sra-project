private static boolean ReturnItem_1(com.intellij.lang.PsiBuilder b, int l) {
    if (!(recursion_guard_(b, l, "ReturnItem_1")))
        return false;
    
    boolean r;
    com.intellij.lang.PsiBuilder.Marker m = enter_section_(b);
    r = com.neueda.jetbrains.plugin.graphdb.language.cypher.parser.CypherParser.Expression(b, (l + 1));
    exit_section_(b, m, null, r);
    return r;
}