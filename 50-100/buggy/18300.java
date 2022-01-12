protected void record(org.eclipse.jdt.core.dom.MethodDeclaration method, org.eclipse.jdt.core.dom.StringLiteral value) {
    if (!(com.google.common.base.Strings.isNullOrEmpty(value.getLiteralValue()))) {
        java.util.List<java.lang.String> paramNames = com.beust.jcommander.internal.Lists.newArrayList();
        paramNames.add(value.getLiteralValue());
        record(method, paramNames);
    }
}