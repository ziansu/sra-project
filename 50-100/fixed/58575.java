public static void parseStList() {
    if ((setTranslator.currToken.tokenType) == (Token.END)) {
        return ;
    }else
        if (((setTranslator.currToken.tokenType) == (Token.IF)) || ((setTranslator.currToken.tokenType) == (Token.ID))) {
            setTranslator.parseNeStList();
            setTranslator.sb.append(";\n");
        }else {
        }
    
}