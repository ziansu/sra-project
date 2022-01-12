@java.lang.Override
public void caseAExpressionListExpressions(AExpressionListExpressions node) {
    inAExpressionListExpressions(node);
    {
        java.util.List<PExp> copy = new java.util.ArrayList<PExp>(node.getExpressionList());
        if ((setPatternRequired) && ((copy.size()) > 1)) {
            throw new NoPatternException("Expecting pattern (Set patterns must have 1 Element.", node);
        }
        for (PExp e : copy) {
            e.apply(this);
        }
    }
    outAExpressionListExpressions(node);
}