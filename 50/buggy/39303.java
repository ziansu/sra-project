public java.math.BigDecimal getMonthlyCosts() {
    return monthlyCosts.multiply(new java.math.BigDecimal(quantity));
}