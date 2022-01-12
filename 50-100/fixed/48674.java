private static double calculation(char operationID, double right, double left) {
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