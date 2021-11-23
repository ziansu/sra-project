public static java.util.ArrayList<Token> process(java.lang.String s) {
    int[][] delta = Tokenizer.initDelta();
    java.util.ArrayList<Token> Tokens = Tokenizer.findAllTokens(s, delta);
    return Tokens;
}