public org.codehaus.groovy.parser.antlr4.ClassNode doCall(org.codehaus.groovy.parser.antlr4.ParseTree it) {
    if (it instanceof org.codehaus.groovy.parser.antlr4.GroovyParser.EnumDeclarationContext)
        parseEnumDeclaration(((org.codehaus.groovy.parser.antlr4.GroovyParser.EnumDeclarationContext) (it)));
    else
        if (it instanceof org.codehaus.groovy.parser.antlr4.GroovyParser.ClassDeclarationContext)
            return parseClassDeclaration(((org.codehaus.groovy.parser.antlr4.GroovyParser.ClassDeclarationContext) (it)));
        else
            if (it instanceof org.codehaus.groovy.parser.antlr4.GroovyParser.PackageDefinitionContext)
                parsePackageDefinition(((org.codehaus.groovy.parser.antlr4.GroovyParser.PackageDefinitionContext) (it)));
            
        
    
    return null;
}