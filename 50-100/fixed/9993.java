private java.lang.Double whichOperator(java.lang.String inputOperator, java.lang.String num1, java.lang.String num2) {
    if (inputOperator.equals("+"))
        return addFn(num1, num2);
    else
        if (inputOperator.equals("-"))
            return subtractFn(num1, num2);
        else
            if (inputOperator.equals("*"))
                return multiplyFn(num1, num2);
            else
                return divideFn(num1, num2);
            
        
    
}