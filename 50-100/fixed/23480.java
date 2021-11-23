public static symjava.bytecode.BytecodeFunc compile(symjava.symbolic.Expr expr) {
    if (expr instanceof symjava.symbolic.Func) {
        symjava.symbolic.Func func = ((symjava.symbolic.Func) (expr));
        return func.toBytecodeFunc();
    }else {
        symjava.symbolic.Func func = new symjava.symbolic.Func(("JITFunc_" + (java.util.UUID.randomUUID().toString().replaceAll("-", ""))), expr);
        return func.toBytecodeFunc(false, false);
    }
}