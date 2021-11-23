private void bracket(com.dragome.compiler.ast.ASTNode node, com.dragome.compiler.ast.InfixExpression.Operator op) {
    if ((((((node instanceof com.dragome.compiler.ast.InfixExpression) && ((((com.dragome.compiler.ast.InfixExpression) (node)).getOperator()) == op)) || (node instanceof com.dragome.compiler.ast.NumberLiteral)) || (node instanceof com.dragome.compiler.ast.NullLiteral)) || (node instanceof com.dragome.compiler.ast.FieldAccess)) || (node instanceof com.dragome.compiler.ast.VariableBinding)) {
        node.visit(this);
    }else {
        print("(");
        node.visit(this);
        print(")");
    }
}