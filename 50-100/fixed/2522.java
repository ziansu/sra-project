public apex.jorje.semantic.compiler.ApexCompiler visitAstsFromStrings(java.util.List<java.lang.String> sources, apex.jorje.semantic.ast.visitor.AstVisitor<apex.jorje.semantic.ast.visitor.AdditionalPassScope> visitor, apex.jorje.semantic.compiler.CompilerStage compilerStage) {
    java.util.List<apex.jorje.semantic.compiler.SourceFile> sourceFiles = sources.stream().map(( s) -> apex.jorje.semantic.compiler.SourceFile.builder().setBody(s).build()).collect(java.util.stream.Collectors.toList());
    apex.jorje.semantic.compiler.CompilationInput compilationUnit = createCompilationInput(sourceFiles, visitor);
    return compile(compilationUnit, visitor, compilerStage);
}