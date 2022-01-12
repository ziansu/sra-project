public slp.IRVisitResult visit(slp.ArrayLenExpr expr, slp.IREnvironment env) {
    slp.IRVisitResult targetExprResult = expr.expr.accept(this, env);
    java.lang.String registerKey = env.getRegisterKey();
    env.writeInstruction("ArrayLength", targetExprResult.value, registerKey);
    return new slp.IRVisitResult(env.getTypeEntry(Environment.INT), registerKey);
}