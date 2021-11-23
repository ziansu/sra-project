@java.lang.Override
public void visit(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration cd, java.lang.Object args) {
    java.lang.String className = cd.getName().toLowerCase();
    for (java.lang.String type : typeNames)
        if (className.contains(type.toLowerCase()))
            hasTypeName = true;
        
    
}