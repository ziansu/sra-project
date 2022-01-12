public static void bytecodeGenResetAll(symjava.symbolic.Expr expr) {
    symjava.symbolic.Expr[] tmp = expr.args();
    for (int i = 0; i < (tmp.length); i++)
        lambdacloud.test.CompileUtils.bytecodeGenResetAll(tmp[i]);
    
    expr.bytecodeGenReset();
}