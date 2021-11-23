private static boolean Expression2_1_0(com.intellij.lang.PsiBuilder b, int l) {
    if (!(recursion_guard_(b, l, "Expression2_1_0")))
        return false;
    
    boolean r;
    com.intellij.lang.PsiBuilder.Marker m = enter_section_(b);
    r = com.neueda.jetbrains.plugin.graphdb.language.cypher.parser.CypherParser.PropertyLookup(b, (l + 1));
    if (!r)
        r = com.neueda.jetbrains.plugin.graphdb.language.cypher.parser.CypherParser.NodeLabels(b, (l + 1));
    
    exit_section_(b, m, null, r);
    return r;
}