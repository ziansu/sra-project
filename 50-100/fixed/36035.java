private boolean isKeywordConstant(com.tamco.hack.compiler.lexical.Lexical token) {
    return (((token.getLecical().equals("true")) || (token.getLecical().equals("false"))) || (token.getLecical().equals("null"))) || (token.getLecical().equals("this"));
}