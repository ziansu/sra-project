private void createMap(java.util.ArrayList<cmpe202.umlparser.CompilationUnit> cu) {
    for (cmpe202.umlparser.CompilationUnit c : cu) {
        java.util.List<cmpe202.umlparser.TypeDeclaration> cl = c.getTypes();
        for (cmpe202.umlparser.Node n : cl) {
            cmpe202.umlparser.ClassOrInterfaceDeclaration classInterfaceDeclaration = ((cmpe202.umlparser.ClassOrInterfaceDeclaration) (n));
            m.put(classInterfaceDeclaration.getName(), classInterfaceDeclaration.isInterface());
        }
    }
}