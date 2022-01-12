private java.util.List<org.sosy_lab.cpachecker.cpa.smg.SMGState> handleDeclaration(org.sosy_lab.cpachecker.cpa.smg.SMGState smgState, org.sosy_lab.cpachecker.cfa.model.c.CDeclarationEdge edge) throws org.sosy_lab.cpachecker.exceptions.CPATransferException {
    logger.log(java.util.logging.Level.ALL, ">>> Handling declaration");
    org.sosy_lab.cpachecker.cfa.ast.c.CDeclaration cDecl = edge.getDeclaration();
    if (!(cDecl instanceof org.sosy_lab.cpachecker.cfa.ast.c.CVariableDeclaration)) {
        return com.google.common.collect.ImmutableList.of(smgState);
    }
    org.sosy_lab.cpachecker.cpa.smg.SMGState newState = new org.sosy_lab.cpachecker.cpa.smg.SMGState(smgState);
    java.util.List<org.sosy_lab.cpachecker.cpa.smg.SMGState> newStates = handleVariableDeclaration(newState, ((org.sosy_lab.cpachecker.cfa.ast.c.CVariableDeclaration) (cDecl)), edge);
    return newStates;
}