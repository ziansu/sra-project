@java.lang.Override
public org.overture.codegen.cgast.STypeCG defaultINode(org.overture.ast.node.INode node, org.overture.codegen.ir.IRInfo question) throws org.overture.ast.analysis.AnalysisException {
    if (node instanceof org.overture.ast.types.PType) {
        if (contains(((org.overture.ast.types.PType) (node)), question)) {
            return new org.overture.codegen.cgast.types.AObjectTypeCG();
        }
        typeStack.push(((org.overture.ast.types.PType) (node)));
        org.overture.codegen.cgast.STypeCG result = super.defaultINode(node, question);
        typeStack.pop();
        return result;
    }
    return super.defaultINode(node, question);
}