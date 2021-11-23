private parsingCalculator.Operation createOperation(double value) {
    if (negateNextValue) {
        value = -value;
    }
    return new parsingCalculator.Operation(currentOperator, value);
}