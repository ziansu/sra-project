public void compile() {
    while ((compilingPhase) < (compileTargetPhase)) {
        (compilingPhase)++;
        for (kalang.compiler.CompilationUnit unit : compilationUnits.values()) {
            unit.compile(compilingPhase);
        }
    } 
}