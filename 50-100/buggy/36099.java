protected final byte[] toToken(final org.basex.query.expr.Item it) throws org.basex.query.expr.QueryException {
    final org.basex.query.expr.Type ip = it.type;
    if (ip.isStringOrUntyped())
        return it.string(info);
    
    throw it instanceof org.basex.query.expr.FItem ? org.basex.query.expr.FIATOM_X.get(info, it) : castError(info, it, AtomType.STR);
}