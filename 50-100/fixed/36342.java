public java.util.List<bb.tokenizer.Token> tokenize(java.lang.String str) {
    java.util.ArrayList<bb.tokenizer.Token> tokens = new java.util.ArrayList<bb.tokenizer.Token>();
    if (str == null) {
        return tokens;
    }
    while ((str.length()) > 0) {
        str = addNextToken(str, tokens);
    } 
    line = 1;
    column = 1;
    position = 0;
    return tokens;
}