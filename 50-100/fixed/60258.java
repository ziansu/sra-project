private soot.jimple.InvokeExpr getSpecialInvoke(soot.jimple.InstanceInvokeExpr expr, edu.rpi.SootMethod senMethod) {
    java.util.List<edu.rpi.Value> args = new java.util.ArrayList(expr.getArgs());
    args.add(0, soot.jimple.NullConstant.v());
    return soot.jimple.Jimple.v().newSpecialInvokeExpr(((edu.rpi.Local) (expr.getBase())), senMethod.makeRef(), args);
}