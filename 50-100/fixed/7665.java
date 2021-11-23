@java.lang.Override
public void exitReturn_stmt(MiniCParser.Return_stmtContext ctx) {
    java.lang.String s1;
    if (hasReturnExpr(ctx)) {
        s1 = newTexts.get(ctx.expr());
        newTexts.put(ctx, (((s1 + "\n") + (blank)) + "retv"));
    }else {
        newTexts.put(ctx, ((blank) + "ret"));
    }
}