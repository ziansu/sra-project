private void checkReferenceTypeVariable(java.lang.String typeVariable, ch.tsphp.tinsphp.common.inference.constraints.TypeVariableConstraint typeVariableConstraint) {
    java.lang.String refTypeVariable = typeVariableConstraint.getTypeVariable();
    if (isNotSelfReference(typeVariable, refTypeVariable)) {
        addConstraintsToRef(typeVariable, refTypeVariable);
    }else
        if ((hasUpperBounds(typeVariable)) && ((upperBounds.get(typeVariable).size()) > 1)) {
            throw new ch.tsphp.tinsphp.symbols.constraints.LowerBoundTypeVariableException(typeVariable, upperBounds.get(typeVariable).values());
        }
    
}