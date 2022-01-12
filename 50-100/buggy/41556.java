private java.math.BigDecimal getRounded(java.math.BigDecimal value) {
    if (isInteger(value)) {
        java.lang.System.out.println("isInt");
        return value;
    }
    if ((value.compareTo(com.implemica.zavizionov.calculator.CalculatorController.MIN)) < 0) {
        return value;
    }
    java.math.BigDecimal nearestInteger = value.setScale(0, java.math.BigDecimal.ROUND_HALF_UP);
    if ((value.subtract(nearestInteger).abs().compareTo(com.implemica.zavizionov.calculator.CalculatorController.DELTA)) < 0) {
        java.lang.System.out.println("here");
        return nearestInteger;
    }
    return value;
}