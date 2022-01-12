@java.lang.Override
public final org.basex.query.expr.Expr optimize(final org.basex.query.expr.QueryContext qc, final org.basex.query.expr.VarScope scp) throws org.basex.query.expr.QueryException {
    seqType = org.basex.query.expr.SeqType.get(exprs[((exprs.length) - 1)].seqType().type, Occ.ZERO_MORE);
    return allAreValues() ? optPre(value(qc), qc) : this;
}