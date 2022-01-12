private static double evaluate(double x, double y, java.lang.String op) {
    double result;
    if ("+".equals(op))
        result = x + y;
    else
        if ("-".equals(op))
            result = x - y;
        else
            if ("*".equals(op))
                result = x * y;
            else
                result = x / y;
            
        
    
    return result;
}