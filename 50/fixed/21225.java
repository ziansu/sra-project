private boolean isSymbolicTerm(java.lang.String pTerm) {
    return SymbolicIdentifier.Converter.getInstance().isSymbolicEncoding(pTerm);
}