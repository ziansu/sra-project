void setOperator(java.lang.String s) {
    operationIndicator = s;
    if (resultFlag) {
        display.setDisplay(operationIndicator, operandTwo);
        operandOne = result;
        resultFlag = false;
    }else {
        display.setDisplay(operandOne, operationIndicator, operandTwo);
    }
}