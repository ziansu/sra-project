private CalcModel.Parser.Result factor() throws java.lang.IllegalArgumentException {
    CalcModel.Parser.Result result;
    if ((currToken()) == '(') {
        result = paren();
    }else
        if ((java.lang.Character.isDigit(currToken())) || ((currToken()) == '?')) {
            result = variable();
        }else {
            throw new java.lang.IllegalArgumentException(((("Expected variable or '(', found '" + (currToken())) + "' at position ") + (currPos)));
        }
    
    return result;
}