@java.lang.Override
public void enterBlock(com.github.simpleregex.parser.SRLParser.BlockContext ctx) {
    if ((ctx.STRING()) != null)
        visitTerminal(ctx.STRING());
    
    visit(ctx.bracketed_stmts(), this::enterBracketed_stmts);
    visit(ctx.stmt(), this::enterStmt);
}