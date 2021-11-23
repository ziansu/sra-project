private static java.math.BigDecimal genericSpeedOrVelocity(int speedOrVelocity) {
    if ((speedOrVelocity < 0) || (speedOrVelocity > 8191)) {
        throw new java.lang.IllegalArgumentException("Speed or velocity out of bounds");
    }
    java.math.BigDecimal result = null;
    if (speedOrVelocity != 8191) {
        result = java.math.BigDecimal.valueOf((speedOrVelocity * 2), 2);
    }
    return result;
}