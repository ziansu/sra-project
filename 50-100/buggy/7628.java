@java.lang.Override
public void enterStmt(com.github.simpleregex.parser.SRLParser.StmtContext ctx) {
    visit(ctx.flag(), this::enterFlag);
    visit(ctx.anchor(), this::enterAnchor);
    if ((ctx.if_stmt()) != null)
        enterConditionalStmt(ctx.if_stmt(), ctx.stmt());
    
    visit(ctx.quantifiable_stmt(), this::enterQuantifiable_stmt);
    visit(ctx.quantifier(), this::enterQuantifier);
}