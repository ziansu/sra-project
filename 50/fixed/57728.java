private compiler.phase.synan.Program parseProgram() throws java.io.IOException {
    compiler.phase.synan.Symbol tmp = laSymbol;
    begLog("Program");
    compiler.phase.synan.Expr expr = parseExpression();
    endLog();
    return new compiler.phase.synan.Program(expr, expr);
}