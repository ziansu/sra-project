@java.lang.Override
public symjava.symbolic.Expr diff(symjava.symbolic.Expr expr) {
    return symjava.symbolic.Negate.simplifiedIns(symjava.symbolic.Sin.simplifiedIns(expr)).multiply(arg.diff(expr));
}