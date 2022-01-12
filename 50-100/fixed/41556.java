private java.math.BigDecimal getRounded(java.math.BigDecimal value) {
    if (isInteger(value)) {
        return value;
    }
    if ((value.compareTo(com.implemica.zavizionov.calculator.CalculatorController.MIN)) < 0) {
        return value;
    }
    java.math.BigDecimal nearestInteger = value.setScale(0, java.math.BigDecimal.ROUND_HALF_UP);
    if ((value.subtract(nearestInteger).abs().compareTo(com.implemica.zavizionov.calculator.CalculatorController.DELTA)) < 0) {
        return nearestInteger;
    }
    return value;
}