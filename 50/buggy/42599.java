public void visit(com.github.davityle.ngprocessor.attrcompiler.node.ObjectField node) {
    java.lang.System.out.println(node.getToken().getScript());
    node.getLHS().accept(this);
}