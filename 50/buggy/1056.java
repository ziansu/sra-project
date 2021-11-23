protected static java.math.BigDecimal amountFactor(com.jnutrition.model.PlanItem item) {
    return new java.math.BigDecimal((((item.getAmount()) / 100.0) * (item.getUnit().inGram())));
}