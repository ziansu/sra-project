public static DefectRepairing.parser.LineNumber parserLineNumber(java.lang.String s) {
    int line;
    int addedline = 0;
    if ((s.indexOf(".")) != (-1)) {
        addedline = java.lang.Integer.parseInt(s.substring(((s.indexOf(".")) + 1)));
        line = java.lang.Integer.parseInt(s.substring(0, s.indexOf(".")));
    }else {
        line = java.lang.Integer.parseInt(s);
    }
    return new DefectRepairing.parser.LineNumber(line, addedline);
}