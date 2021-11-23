@java.lang.Override
public void enterBracketed_stmts(com.github.simpleregex.parser.SRLParser.Bracketed_stmtsContext ctx) {
    ctx.stmt().forEach(this::enterStmt);
}