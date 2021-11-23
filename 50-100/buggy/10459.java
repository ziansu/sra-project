@java.lang.Override
public java.lang.String visitSimple_stmt(lessa.ExprParser.Simple_stmtContext ctx) {
    java.lang.System.out.println("simple_stmt -> small_stmt (';' small_stmt)* ';' ");
    java.lang.String ret = (visit(ctx.small_stmt(0))) + "\n";
    int i = 1;
    while ((ctx.small_stmt(i)) != null) {
        ret += (visit(ctx.small_stmt(i))) + "\n";
    } 
    return ret;
}