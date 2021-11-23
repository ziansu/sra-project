private java.lang.String prettylist(java.util.List<fol.ast.Expr> exprs2) {
    java.lang.StringBuilder b = new java.lang.StringBuilder();
    for (fol.ast.Expr e : exprs) {
        b.append(e.toString());
        b.append(',');
    }
    b.deleteCharAt(((b.length()) - 1));
    return b.toString();
}