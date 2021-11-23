@java.lang.Override
public boolean visit(org.eclipse.php.internal.core.compiler.ast.visitor.InterfaceDeclaration s) throws java.lang.Exception {
    if ((s.getSuperClasses()) == null)
        return true;
    
    for (org.eclipse.dltk.ast.ASTNode node : s.getSuperClasses().getChilds()) {
        checkSuperclass(((org.eclipse.dltk.ast.references.TypeReference) (node)), true, s.getName());
    }
    return visitGeneral(s);
}