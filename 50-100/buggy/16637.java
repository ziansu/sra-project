public void addExplicitRelation(org.sosy_lab.cpachecker.cpa.smg.SMGTransferRelation.SMGSymbolicValue pSymbolicValue, java.lang.Integer pCType1, org.sosy_lab.cpachecker.cpa.smg.SMGTransferRelation.SMGExplicitValue pExplicitValue, java.lang.Integer pCType2, org.sosy_lab.cpachecker.cfa.ast.c.CBinaryExpression.BinaryOperator pOp) {
    assert pCType1 == pCType2;
    addExplicitRelation(pSymbolicValue.getAsInt(), pExplicitValue, pOp);
    addValueSize(pSymbolicValue.getAsInt(), pCType1);
}