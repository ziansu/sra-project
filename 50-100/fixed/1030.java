@java.lang.Override
public java.lang.String visitArith_expr(lessa.ExprParser.Arith_exprContext ctx) {
    java.lang.System.out.println("arith_expr -> term (op=('+'|'-') term)*");
    java.lang.String arithstring = visit(ctx.term(0));
    int i = 1;
    while ((ctx.term(i)) != null) {
        arithstring += ((" " + (ctx.ADDMINOP((i - 1)).getText())) + " ") + (visit(ctx.term((i++))));
        i++;
    } 
    return arithstring;
}