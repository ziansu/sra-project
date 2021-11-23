private int generate(wyc.builder.Expr.LocalVariable expr, wyc.builder.CodeGenerator.Environment environment, wyil.util.AttributedCodeBlock codes, wyc.lang.WhileyFile.Context context) throws wycc.util.ResolveError {
    if ((environment.get(expr.var)) != null) {
        wyc.builder.Type type = expr.result().raw();
        return environment.get(expr.var);
    }else {
        wyc.lang.WhileyFile.syntaxError(errorMessage(wyc.builder.VARIABLE_POSSIBLY_UNITIALISED), context, expr);
        return -1;
    }
}