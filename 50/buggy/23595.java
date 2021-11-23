@java.lang.Override
protected edu.nyu.acsys.CVC4.Expr lessThan(edu.nyu.acsys.CVC4.Expr pParam1, edu.nyu.acsys.CVC4.Expr pParam2) {
    return exprManager.mkExpr(Kind.FLOATINGPOINT_LT, pParam1, param2);
}