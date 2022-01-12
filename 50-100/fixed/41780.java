public double calculate(double num1, double num2) {
    switch (operator) {
        case PLUS :
            return num1 + num2;
        case MINUS :
            return num1 - num2;
        case DIVIDE :
            return num1 / num2;
        case MULTIPLY :
            return num1 * num2;
        default :
            java.lang.System.out.println("ERROR WRONG OPERATOR");
            return -1;
    }
}