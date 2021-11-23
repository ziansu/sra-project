public com.myapp.calculator.ast.ExpressionNode constructExpressionNodes(com.myapp.calculator.ast.Expression expression) {
    java.util.LinkedList<com.myapp.calculator.ast.ExpressionUnit> list = expression.getUnits();
    if ((list.size()) == 0)
        return null;
    
    com.myapp.calculator.ast.ExpressionNode head = new com.myapp.calculator.ast.ExpressionNode(list.get(0));
    com.myapp.calculator.ast.ExpressionNode curr = head;
    for (int i = 1; i < (list.size()); i++)
        curr = new com.myapp.calculator.ast.ExpressionNode(list.get(i), curr, null);
    
    return head;
}