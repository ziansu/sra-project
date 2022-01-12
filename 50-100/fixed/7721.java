private static double operation(char op, double val1, double val2) {
    switch (op) {
        case '+' :
            return val2 + val1;
        case '-' :
            return val2 - val1;
        case '*' :
            return val2 * val1;
        case '/' :
            if (val1 == 0)
                throw new java.lang.UnsupportedOperationException("Cannot divide by zero");
            
            return val2 / val1;
        case '^' :
            return java.lang.Math.pow(val2, val1);
    }
    return 0;
}