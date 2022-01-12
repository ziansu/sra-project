public java.math.BigDecimal getMonthlyCosts() {
    if ((quantity) == 0) {
        return monthlyCosts;
    }else {
        return monthlyCosts.multiply(new java.math.BigDecimal(quantity));
    }
}