public miniJava.ContextualAnalyzer.Type visitIdentifier(miniJava.ContextualAnalyzer.Identifier id, java.lang.Object arg) {
    miniJava.ContextualAnalyzer.Type idType = id.getDecl().type;
    if ((idType.typeKind) == (TypeKind.UNSUPPORTED))
        typeCheckFatalError(((("Encountered UNSUPPORTED type for " + id) + " of name ") + (id.spelling)));
    
    return id.getDecl().type;
}