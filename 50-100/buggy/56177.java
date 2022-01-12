public static java.lang.String differenceRule(java.lang.String term1, java.lang.String term2) throws simpleDifferentiation.rj.InvalidExpression {
    if (term1.equals(""))
        return "-" + (simpleDifferentiation.rj.Calculator.getDerivative(term2));
    else
        if (term2.equals(""))
            return simpleDifferentiation.rj.Calculator.getDerivative(term1);
        else
            return ((simpleDifferentiation.rj.Calculator.getDerivative(term1)) + "-") + (simpleDifferentiation.rj.Calculator.getDerivative(term2));
        
    
}