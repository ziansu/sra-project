protected void record(org.eclipse.jdt.core.dom.MethodDeclaration method, org.eclipse.jdt.core.dom.ArrayInitializer values) {
    java.util.List<?> literals = values.expressions();
    java.util.List<java.lang.String> paramNames = new java.util.ArrayList<java.lang.String>(literals.size());
    for (int i = 0; i < (literals.size()); i++) {
        org.eclipse.jdt.core.dom.StringLiteral str = ((org.eclipse.jdt.core.dom.StringLiteral) (literals.get(i)));
        paramNames.add(str.getLiteralValue());
    }
    record(method, paramNames);
}