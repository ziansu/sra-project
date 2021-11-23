@java.lang.Override
public void visit(com.miracle.astree.node.expression.multiary.MiracleASTreeCallExpression miracleASTreeCallExpression) {
    enter();
    java.lang.System.out.print("call ");
    miracleASTreeCallExpression.getFunction().accept(this);
    java.lang.System.out.print('(');
    boolean first = true;
    for (com.miracle.astree.node.expression.MiracleASTreeExpression exp : miracleASTreeCallExpression.getArguments()) {
        if (!first) {
            java.lang.System.out.print(',');
        }
        first = false;
        exp.accept(this);
    }
    java.lang.System.out.println(")");
    exit();
}