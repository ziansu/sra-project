public void ifStmt(boolean bExec) throws java.lang.Exception {
    java.lang.Object resTrueStmts;
    java.lang.Object resFalseStmts;
    if (bExec == true) {
        havabol.ResultValue resCond = evalCond();
        if ((resCond.value) == "true") {
            scan.getNext();
            scan.getNext();
            statements(true);
            statements(false);
        }else {
            statements(false);
            statements(true);
        }
    }else {
    }
}