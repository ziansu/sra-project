private java.math.BigDecimal[] calculateFirstError(java.math.BigDecimal[] expectedOutput, java.math.BigDecimal[] calculatedOutput) {
    java.math.BigDecimal[] error = new java.math.BigDecimal[expectedOutput.length];
    for (int i = 0; i < (expectedOutput.length); i++) {
        error[i] = expectedOutput[i].subtract(calculatedOutput[i]);
    }
    return error;
}