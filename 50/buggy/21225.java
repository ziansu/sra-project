private boolean isSymbolicTerm(org.sosy_lab.java_smt.api.Formula pTerm) {
    return SymbolicIdentifier.Converter.getInstance().isSymbolicEncoding(pTerm.toString());
}