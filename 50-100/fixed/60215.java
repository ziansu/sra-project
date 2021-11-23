@java.lang.Override
public java.lang.Object visitInitExpr(VC.Checker.InitExpr initExpr, java.lang.Object o) {
    VC.Checker.Type declType = ((VC.Checker.Type) (o));
    if (!(declType.isArrayType())) {
        reporter.reportError(errMesg[14], "", initExpr.position);
        initExpr.type = VC.StdEnvironment.errorType;
        return initExpr.type;
    }
    return initExpr.IL.visit(this, ((VC.Checker.ArrayType) (declType)).T);
}