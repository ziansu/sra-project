protected void record(org.eclipse.jdt.core.dom.MethodDeclaration method, org.eclipse.jdt.core.dom.StringLiteral value) {
    if (!(com.google.common.base.Strings.isNullOrEmpty(value.getLiteralValue()))) {
        java.util.List<java.lang.String> paramNames = new java.util.ArrayList<java.lang.String>();
        paramNames.add(value.getLiteralValue());
        record(method, paramNames);
    }
}