private void collectNestedConstraintVariables(net.ssehub.easy.varModel.cst.ConstraintSyntaxTree cst, net.ssehub.easy.varModel.model.ContainableModelElement element) {
    if (null != cst) {
        net.ssehub.easy.varModel.model.filter.DeclrationInConstraintFinder finder = new net.ssehub.easy.varModel.model.filter.DeclrationInConstraintFinder(cst);
        java.util.Set<net.ssehub.easy.varModel.model.AbstractVariable> usedDeclarations = finder.getDeclarations();
        for (net.ssehub.easy.varModel.model.AbstractVariable usedDecl : usedDeclarations) {
            if ((usedDecl.getType()) == (net.ssehub.easy.varModel.model.datatypes.ConstraintType.TYPE)) {
                table.putConstraintOccurrence(usedDecl, element);
            }
        }
    }
}