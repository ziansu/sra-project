@java.lang.Override
public T visit(com.bamless.interpreter.ast.expression.PostIncrementOperation p, A arg) {
    return p.getExpression().accept(this, arg);
}