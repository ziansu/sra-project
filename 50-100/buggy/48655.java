private double handleOp(com.rymader.calculator.Operator op) {
    double display = 0;
    reset = false;
    if (onLeft) {
        onLeft = false;
        operator = op;
        display = numLeft;
    }else {
        display = calculate(numLeft, numRight, operator);
        numLeft = display;
        operator = op;
    }
    return display;
}