@java.lang.Override
public void visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration cd, java.lang.Object args) {
    for (java.lang.String type : typeNames)
        if (cd.getName().contains(type))
            hasTypeName = true;
        
    
}