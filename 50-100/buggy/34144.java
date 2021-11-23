private java.lang.String getThrows(org.eclipse.jdt.core.dom.MethodDeclaration method) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
    for (int i = 0; i < (method.thrownExceptionTypes().size()); i++) {
        sb.append(((method.thrownExceptionTypes().get(i).toString()) + (i != ((method.thrownExceptionTypes().size()) - 1) ? ", " : "")));
    }
    return sb.toString();
}