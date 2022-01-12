public java.math.BigDecimal getMAPrediction(int daysAgo, int days, int futureDays) throws java.io.IOException {
    java.math.BigDecimal day1 = getMA(daysAgo, (days - 1));
    java.math.BigDecimal day2 = getMA((daysAgo - 1), (days - 1));
    java.math.BigDecimal slope = day1.subtract(day2);
    java.math.BigDecimal closePrice = getHistory(daysAgo, 0).remove(0).getAdjClose();
    return closePrice.add(slope.multiply(new java.math.BigDecimal(futureDays)));
}