private void extractGrounds(wyal.util.Expr e, java.util.Set<wyal.util.Expr> grounds) {
    for (int i = 0; i != (e.size()); ++i) {
        wyal.lang.SyntacticItem child = e.getOperand(i);
        if (child instanceof wyal.util.Expr) {
            extractGrounds(((wyal.util.Expr) (child)), grounds);
        }
    }
    if (e instanceof wyal.lang.WyalFile.Expr.Polynomial) {
        grounds.add(e);
    }
}