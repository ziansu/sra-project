public static DefectRepairing.parser.LineNumber parserLineNumber(java.lang.String s) {
    int line = java.lang.Integer.parseInt(s);
    int addedline = 0;
    if ((s.indexOf(".")) != (-1))
        addedline = java.lang.Integer.parseInt(s.substring(((s.indexOf(".")) + 1)));
    
    return new DefectRepairing.parser.LineNumber(line, addedline);
}