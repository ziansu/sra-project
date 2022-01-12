@java.lang.Override
public java.lang.Object visit(net.sourceforge.pmd.lang.java.ast.ASTName node, java.lang.Object data) {
    if ((!((node.jjtGetParent()) instanceof net.sourceforge.pmd.lang.java.ast.ASTImportDeclaration)) && (!((node.jjtGetParent()) instanceof net.sourceforge.pmd.lang.java.ast.ASTPackageDeclaration))) {
        checkImports(node);
    }
    return data;
}