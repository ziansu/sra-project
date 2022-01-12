public static symjava.bytecode.BytecodeVecFunc compileVecFunc(symjava.symbolic.Expr[] args, symjava.symbolic.Expr expr) {
    java.lang.String className = "JITVecFunc_YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY" + (java.util.UUID.randomUUID().toString().replaceAll("-", ""));
    com.sun.org.apache.bcel.internal.generic.ClassGen genClass = symjava.symbolic.utils.BytecodeUtils.genClassBytecodeVecFunc(className, expr, args, true, false);
    symjava.symbolic.utils.FuncClassLoader<symjava.bytecode.BytecodeVecFunc> fcl = new symjava.symbolic.utils.FuncClassLoader<symjava.bytecode.BytecodeVecFunc>();
    return fcl.newInstance(genClass);
}