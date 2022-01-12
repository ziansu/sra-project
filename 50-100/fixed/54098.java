private boolean getResult() {
    if (currentOperator.isEmpty())
        return false;
    
    java.lang.String[] operation = display.split(java.util.regex.Pattern.quote(currentOperator));
    if ((operation.length) < 2)
        return false;
    
    result = java.lang.String.valueOf(operate(operation[0], operation[1], currentOperator));
    return true;
}