public java.math.BigDecimal getValue() {
    fundValue = java.math.BigDecimal.ZERO;
    java.math.BigDecimal sval = java.math.BigDecimal.ZERO;
    for (int i = 0; i < 9; i++) {
        hfm.Stock s = HFMController.STOCKS.get(i);
        sval = s.getStockValue().multiply(new java.math.BigDecimal(fundStocks[i]));
        fundValue.add(sval);
    }
    fundValue.add(fundCash);
    return fundValue;
}