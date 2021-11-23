private static org.eclipse.jdt.core.dom.ImportDeclaration getProblematicImport(org.eclipse.jdt.core.compiler.IProblem problem, org.eclipse.jdt.core.dom.CompilationUnit astRoot) {
    org.eclipse.jdt.core.dom.ASTNode coveringNode = new org.eclipse.jdt.core.dom.NodeFinder(astRoot, problem.getSourceStart(), ((problem.getSourceEnd()) - (problem.getSourceEnd()))).getCoveringNode();
    if (coveringNode != null) {
        org.eclipse.jdt.core.dom.ASTNode importNode = org.eclipse.jdt.internal.corext.dom.ASTNodes.getParent(coveringNode, org.eclipse.jdt.core.dom.ASTNode.IMPORT_DECLARATION);
        if (importNode instanceof org.eclipse.jdt.core.dom.ImportDeclaration) {
            return ((org.eclipse.jdt.core.dom.ImportDeclaration) (importNode));
        }
    }
    return null;
}