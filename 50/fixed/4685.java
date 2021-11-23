private boolean isClassVarDec(com.tamco.hack.compiler.lexical.Lexical token) {
    return (token.getLecical().equals("static")) || (token.getLecical().equals("field"));
}