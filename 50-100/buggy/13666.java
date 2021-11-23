public static int getPrecedence(java.lang.String op) {
    if (RPN.CheckFunc(op)) {
        return 5;
    }
    switch (op) {
        case "(" :
            {
                return 5;
            }
        case ")" :
            {
                return 5;
            }
        case "^" :
            {
                return 4;
            }
        case "*" :
            {
                return 3;
            }
        case "/" :
            {
                return 3;
            }
        case "+" :
            {
                return 2;
            }
        case "-" :
            {
                return 2;
            }
    }
    return 5;
}