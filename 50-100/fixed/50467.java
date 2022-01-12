protected void printForwardDeclarations(java.util.Set<com.google.devtools.j2objc.types.Import> forwardDecls) {
    java.util.Set<java.lang.String> forwardStmts = com.google.common.collect.Sets.newTreeSet();
    for (com.google.devtools.j2objc.types.Import imp : forwardDecls) {
        forwardStmts.add(createForwardDeclaration(imp.getTypeName(), imp.isInterface()));
    }
    if (!(forwardStmts.isEmpty())) {
        newline();
        for (java.lang.String stmt : forwardStmts) {
            println(stmt);
        }
    }
}