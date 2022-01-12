private static jkind.lustre.Equation getHist(jkind.lustre.IdExpr histId, jkind.lustre.Expr expr) {
    jkind.lustre.Expr preHist = new jkind.lustre.UnaryExpr(jkind.lustre.UnaryOp.PRE, histId);
    jkind.lustre.Expr preAndNow = new jkind.lustre.BinaryExpr(preHist, jkind.lustre.BinaryOp.AND, expr);
    return new jkind.lustre.Equation(histId, new jkind.lustre.BinaryExpr(expr, jkind.lustre.BinaryOp.ARROW, preAndNow));
}