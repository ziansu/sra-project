public java.lang.String differenceRule(java.lang.String term1, java.lang.String term2) throws simpleDifferentiation.rj.InvalidExpression {
    if (term1.equals(""))
        return "-" + (getDerivative(term2));
    else
        if (term2.equals(""))
            return getDerivative(term1);
        else
            return ((getDerivative(term1)) + "-") + (getDerivative(term2));
        
    
}