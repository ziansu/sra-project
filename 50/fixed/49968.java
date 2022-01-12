@java.lang.Override
public void visit(final edu.kit.iti.formal.pse.worthwhile.model.ast.VariableDeclaration variableDeclaration) {
    if ((variableDeclaration.getType()) instanceof edu.kit.iti.formal.pse.worthwhile.model.ast.ArrayType) {
        at.setBaseType(((edu.kit.iti.formal.pse.worthwhile.model.ast.ArrayType) (ts.typeof(variableDeclaration))).getBaseType());
    }
}