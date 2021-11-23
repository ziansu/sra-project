@java.lang.Override
protected void addNumberToComputingStack(java.lang.String number) {
    try {
        computingStack.push(java.lang.Integer.valueOf(number));
    } catch (java.lang.NumberFormatException ex) {
        throw new CalculatorExceptions.UnsupportedOperationCalculatorException();
    }
}