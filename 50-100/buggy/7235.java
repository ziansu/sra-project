public java.util.List<bb.tokenizer.Token> tokenize(java.lang.String str) {
    java.util.ArrayList<bb.tokenizer.Token> tokens = new java.util.ArrayList<bb.tokenizer.Token>();
    while ((str.length()) > 0) {
        str = addNextToken(str, tokens);
    } 
    line = 0;
    column = 0;
    return tokens;
}