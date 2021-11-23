public java.lang.String sumRule(java.lang.String term1, java.lang.String term2) throws simpleDifferentiation.rj.InvalidExpression {
    if (term1.equals(""))
        return getDerivative(term2);
    else
        if (term2.equals(""))
            return getDerivative(term1);
        else
            return ((getDerivative(term2)) + "+") + (getDerivative(term1));
        
    
}