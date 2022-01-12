@java.lang.Override
public java.lang.Integer parse(java.lang.String[] tokens, int pos, java.util.Stack<org.dvare.expression.Expression> stack, org.dvare.binding.expression.ExpressionBinding expressionBinding, org.dvare.binding.model.ContextsBinding contextss) throws org.dvare.exceptions.parser.ExpressionParseException {
    pos = findNextExpression(tokens, (pos + 1), stack, expressionBinding, contextss);
    computeParam(this.leftOperand);
    stack.push(this);
    return pos;
}