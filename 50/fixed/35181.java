void setOperator(java.lang.String s) {
    operationIndicator = s;
    if (resultFlag) {
        operandOne = result;
        resultFlag = false;
    }
    display.setDisplay(operandOne, operationIndicator, operandTwo);
}