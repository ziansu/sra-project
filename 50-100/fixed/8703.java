public static AST.AST_CLASSDECL getClass(java.lang.String className) {
    java.util.List<AST.AST_CLASSDECL> classList = AST.SemanticChecker.program.getClassDeclList().getListOfClassDecl();
    for (AST.AST_CLASSDECL classDecl : classList) {
        if (classDecl.classId.equals(className)) {
            return classDecl;
        }
    }
    return null;
}