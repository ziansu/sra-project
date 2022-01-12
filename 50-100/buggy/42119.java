private com.bamless.interpreter.ast.statement.Statement statement() {
    switch (lex.peek().getType()) {
        case "IF" :
            return ifStmt();
        case "WHILE" :
            return whileStmt();
        case "FOR" :
            return forStmt();
        case "{" :
            return block();
        case "PRINT" :
            return printStmt();
        default :
            com.bamless.interpreter.ast.statement.Statement s = expression();
            require(";");
            return s;
    }
}