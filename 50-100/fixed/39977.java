private boolean isStatement(com.tamco.hack.compiler.lexical.Lexical token) {
    return ((((token.getLecical().equals("let")) || (token.getLecical().equals("if"))) || (token.getLecical().equals("while"))) || (token.getLecical().equals("do"))) || (token.getLecical().equals("return"));
}