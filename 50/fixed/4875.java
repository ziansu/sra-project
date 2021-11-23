public double getEquityValue() {
    if (isEmpty()) {
        return 0.0;
    }
    return portfolioItems.values().iterator().next().getEquityValue();
}