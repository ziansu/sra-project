private com.bamless.interpreter.ast.statement.Statement printStmt() {
    com.bamless.interpreter.ast.Position start = require("PRINT").getPosition();
    boolean parenthesized = lex.peek().getValue().equals("(");
    if (parenthesized)
        require("(");
    
    com.bamless.interpreter.ast.expression.Expression e = expression();
    if (parenthesized)
        require(")");
    
    return new com.bamless.interpreter.ast.statement.PrintStatement(start, e);
}