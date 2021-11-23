@java.lang.Override
public void visitAssignPreorder(net.alexweinert.coolc.program.ast.Assign assign) {
    stringBuilder.append(assign.getVariableIdentifier());
    stringBuilder.append(" <- ");
}