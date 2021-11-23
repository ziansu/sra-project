@java.lang.Override
public java.util.ArrayList<java.lang.String> visitStringWithExpression(DomboParser.StringWithExpressionContext ctx) {
    java.util.ArrayList<java.lang.String> code = new java.util.ArrayList<>();
    code.add(("new java/lang/StringBuilder\n" + ("dup\n" + "invokespecial\tjava/lang/StringBuilder/<init>()V ; Call string builder constructor\n")));
    code.addAll(visit(ctx.stringExpression()));
    code.add("invokevirtual\tjava/lang/StringBuilder.append(Ljava/lang/String;)Ljava/lang/StringBuilder; ;String to StringBuilder\n");
    code.addAll(visit(ctx.expression()));
    code.add(("invokevirtual\tjava/lang/StringBuilder.append(I)Ljava/lang/StringBuilder; ;Append number to StringBuilder\n" + (("invokevirtual\tjava/lang/StringBuilder.toString()Ljava/lang/String; ;Call toString from StringBuilder\n" + "astore_2\n") + "aload_2\n")));
    return code;
}