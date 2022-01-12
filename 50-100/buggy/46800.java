private java.math.BigDecimal[] calculateFirstError(java.math.BigDecimal[] expectedOutput, java.math.BigDecimal[] calculatedOutput) {
    for (int i = 0; i < (expectedOutput.length); i++) {
        expectedOutput[i] = expectedOutput[i].subtract(calculatedOutput[i]);
    }
    return expectedOutput;
}