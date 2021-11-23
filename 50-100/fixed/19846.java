private void runAssignment(org.w3c.dom.Node node) {
    org.w3c.dom.Node identifier = node.getChildNodes().item(0);
    org.w3c.dom.Node expression = node.getChildNodes().item(1);
    mt.edu.um.cs.cps2000.runtime.VariableStruct var = stackFrames.peek().getVariable(identifier.getTextContent());
    var.setValue(runExpression(expression));
}