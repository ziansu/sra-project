@java.lang.Override
public java.math.BigDecimal eval(java.util.List<java.math.BigDecimal> parameters) {
    java.math.BigDecimal toRound = parameters.get(0);
    return toRound.setScale(100, java.math.RoundingMode.FLOOR);
}