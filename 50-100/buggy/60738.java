private static boolean ProcedureResults_2(com.intellij.lang.PsiBuilder b, int l) {
    if (!(com.intellij.lang.parser.GeneratedParserUtilBase.recursion_guard_(b, l, "ProcedureResults_2")))
        return false;
    
    int c = com.intellij.lang.parser.GeneratedParserUtilBase.current_position_(b);
    while (true) {
        if (!(com.neueda.jetbrains.plugin.graphdb.language.cypher.parser.CypherParser.ProcedureResults_2_0(b, (l + 1))))
            break;
        
        if (!(com.intellij.lang.parser.GeneratedParserUtilBase.empty_element_parsed_guard_(b, "ProcedureResults_2", c)))
            break;
        
        c = com.intellij.lang.parser.GeneratedParserUtilBase.current_position_(b);
    } 
    return true;
}