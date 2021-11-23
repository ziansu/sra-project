@java.lang.Override
public java.lang.Object visitArgList(VC.Checker.ArgList argList, java.lang.Object o) {
    VC.Checker.List formalParaList = ((VC.Checker.List) (o));
    if (formalParaList.isEmptyParaList()) {
        reporter.reportError(errMesg[25], "", argList.position);
    }else {
        argList.A.visit(this, ((VC.Checker.ParaList) (formalParaList)).P);
        argList.AL.visit(this, ((VC.Checker.ParaList) (formalParaList)).PL);
    }
    return null;
}