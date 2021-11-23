@java.lang.Override
public java.lang.String visitSubscriptlist(lessa.ExprParser.SubscriptlistContext ctx) {
    java.lang.System.out.println("subscriptlist -> subscript ( ',' subscript )* ");
    java.lang.String ret = visit(ctx.subscript(0));
    int i = 1;
    while ((ctx.subscript(i)) != null) {
        ret += "," + (visit(ctx.subscript(i)));
        i++;
    } 
    java.lang.System.out.println(("subscriptlist -> subscript ( ',' subscript )* return:" + ret));
    return ret;
}