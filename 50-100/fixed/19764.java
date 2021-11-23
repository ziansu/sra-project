@java.lang.Override
public boolean equals(java.lang.Object other) {
    if (other == null)
        return false;
    
    return (super.baseEquals(other)) && ((fExpression) == null) ? (((org.eclipse.cdt.examples.dsf.pda.service.PDAExpressions.InvalidExpressionDMContext) (other)).getExpression()) == null : fExpression.equals(((org.eclipse.cdt.examples.dsf.pda.service.PDAExpressions.InvalidExpressionDMContext) (other)).getExpression());
}