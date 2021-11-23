static boolean cypher(com.intellij.lang.PsiBuilder b, int l) {
    if (!(com.intellij.lang.parser.GeneratedParserUtilBase.recursion_guard_(b, l, "cypher")))
        return false;
    
    int c = com.intellij.lang.parser.GeneratedParserUtilBase.current_position_(b);
    while (true) {
        if (!(com.neueda.jetbrains.plugin.graphdb.language.cypher.parser.CypherParser.StatementItem(b, (l + 1))))
            break;
        
        if (!(com.intellij.lang.parser.GeneratedParserUtilBase.empty_element_parsed_guard_(b, "cypher", c)))
            break;
        
        c = com.intellij.lang.parser.GeneratedParserUtilBase.current_position_(b);
    } 
    return true;
}