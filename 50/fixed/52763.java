public static final void clearContext(int contextId, org.exist.xquery.Sequence seq) throws org.exist.xquery.XPathException {
    if ((seq != null) && (!(seq instanceof org.exist.xquery.VirtualNodeSet))) {
        seq.clearContext(contextId);
    }
}