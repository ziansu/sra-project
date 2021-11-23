public java.math.BigDecimal getLogProbability() {
    if ((probability) == null) {
        return java.math.BigDecimal.ZERO;
    }
    if ((logProbability) != null) {
        this.logProbability = java.math.BigDecimal.valueOf(java.lang.Math.log10(this.probability.doubleValue()));
    }
    return this.logProbability;
}