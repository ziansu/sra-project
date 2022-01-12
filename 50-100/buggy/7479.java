private kalang.compiler.CompilationUnit createCompilationUnit(java.lang.String className, java.lang.String src) {
    kalang.compiler.CompilationUnit unit = new kalang.compiler.CompilationUnit(className, src, this);
    unit.setParsingErrorHandler(sourceParsingErrorhandler);
    unit.setSemanticErrorHandler(astSemanticErrorHandler);
    unit.compile(compilingPhase);
    compilationUnits.put(className, unit);
    return unit;
}