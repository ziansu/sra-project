private org.eclipse.rdf4j.query.algebra.Var createVar(java.lang.String varName) {
    if ((projElems) != null) {
        org.eclipse.rdf4j.query.algebra.ProjectionElem projElem = projElems.get(varName);
        if (projElem != null) {
            org.eclipse.rdf4j.query.algebra.ExtensionElem extElem = projElem.getSourceExpression();
            if ((extElem != null) && ((extElem.getExpr()) instanceof org.eclipse.rdf4j.query.algebra.Var)) {
                projElems.remove(varName);
            }
        }
    }
    return new org.eclipse.rdf4j.query.algebra.Var(varName);
}