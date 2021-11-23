public void visitBinaryNode(nez.ast.jcode.JCodeTree node) {
    nez.ast.jcode.JCodeTree left = node.get(0);
    nez.ast.jcode.JCodeTree right = node.get(1);
    node.setType(typeInfferBinary(left, right));
    this.visit(left);
    this.visit(right);
    this.mBuilder.callStaticMethod(nez.ast.jcode.JCodeOperator.class, node.getTypedClass(), node.getTag().getName(), left.getTypedClass(), node.getTypedClass());
}