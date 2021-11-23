private boolean isKeywordConstant(com.tamco.hack.compiler.lexical.Lexical token) {
    return ((((token.getLecical()) == "true") || ((token.getLecical()) == "false")) || ((token.getLecical()) == "null")) || ((token.getLecical()) == "this");
}