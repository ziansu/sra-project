public java.math.BigDecimal getValue() {
    fundValue = java.math.BigDecimal.ZERO;
    java.math.BigDecimal sval = java.math.BigDecimal.ZERO;
    for (int i = 0; i < 9; i++) {
        sval = HFMController.STOCKS.get(i).getStockValue().multiply(new java.math.BigDecimal(fundStocks[i]));
        fundValue = fundValue.add(sval);
    }
    fundValue.add(fundCash);
    return fundValue;
}