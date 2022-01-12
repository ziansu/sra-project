private java.lang.String prettylist(java.util.List<fol.ast.Expr> list) {
    java.lang.StringBuilder b = new java.lang.StringBuilder();
    java.lang.System.out.println(b.toString());
    for (fol.ast.Expr e : list) {
        b.append(e.toString());
        b.append(',');
    }
    b.deleteCharAt(((b.length()) - 1));
    return b.toString();
}