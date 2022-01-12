private static double calculation(char operationID, double left, double right) {
    switch (operationID) {
        case '+' :
            return left + right;
        case '−' :
            return left - right;
        case '×' :
            return left * right;
        case '÷' :
            return left / right;
        default :
            return 0.0;
    }
}