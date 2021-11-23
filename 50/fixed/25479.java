@java.lang.Override
public java.lang.String getKind() {
    if ("pred".equals(ast.getArgument(2).toString())) {
        return de.prob.animator.domainobjects.EvalElementType.PREDICATE.toString();
    }
    return de.prob.animator.domainobjects.EvalElementType.EXPRESSION.toString();
}