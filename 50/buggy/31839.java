public void visit(com.github.davityle.ngprocessor.attrcompiler.node.FunctionCall node) {
    java.lang.System.out.println(node.getToken().getScript());
    for (com.github.davityle.ngprocessor.attrcompiler.node.Expression expression : node.getParameters()) {
        expression.accept(this);
    }
}