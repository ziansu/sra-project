static boolean cypher(com.intellij.lang.PsiBuilder b, int l) {
    if (!(recursion_guard_(b, l, "cypher")))
        return false;
    
    int c = current_position_(b);
    while (true) {
        if (!(com.neueda.jetbrains.plugin.graphdb.language.cypher.parser.CypherParser.StatementItem(b, (l + 1))))
            break;
        
        if (!(empty_element_parsed_guard_(b, "cypher", c)))
            break;
        
        c = current_position_(b);
    } 
    return true;
}