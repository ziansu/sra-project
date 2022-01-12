public void visitBinaryNode(nez.ast.jcode.JCodeTree node) {
    nez.ast.jcode.JCodeTree left = node.get(0);
    nez.ast.jcode.JCodeTree right = node.get(1);
    this.visit(left);
    this.visit(right);
    node.setType(typeInfferBinary(node, left, right));
    this.mBuilder.callStaticMethod(nez.ast.jcode.JCodeOperator.class, node.getTypedClass(), node.getTag().getName(), left.getTypedClass(), right.getTypedClass());
}