protected void onLocalVariableDeclarationLeave(edu.kit.ipd.pp.minijavac.codegen.LocalVariableDeclarationStatementNode node) {
    node.firmVarNumber = varCounter;
    firm.nodes.Node initValue;
    if ((node.expression) != null) {
        initValue = node.expression.firmNode;
        construction.setVariable(((parameterCount) + ((varCounter)++)), initValue);
    }
}