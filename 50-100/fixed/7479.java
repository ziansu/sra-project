private kalang.compiler.CompilationUnit createCompilationUnit(java.lang.String className, java.lang.String src) {
    kalang.compiler.CompilationUnit unit = new kalang.compiler.CompilationUnit(className, src, this);
    compilationUnits.put(className, unit);
    unit.setParsingErrorHandler(sourceParsingErrorhandler);
    unit.setSemanticErrorHandler(astSemanticErrorHandler);
    unit.compile(compilingPhase);
    return unit;
}