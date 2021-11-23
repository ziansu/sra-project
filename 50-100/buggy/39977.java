private boolean isStatement(com.tamco.hack.compiler.lexical.Lexical token) {
    return (((((token.getLecical()) == "let") || ((token.getLecical()) == "if")) || ((token.getLecical()) == "while")) || ((token.getLecical()) == "do")) || ((token.getLecical()) == "return");
}