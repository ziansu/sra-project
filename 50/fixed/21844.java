public double calculateProfit() {
    double profit = (closePrice) - (openPrice);
    if ((type) == (com.gorkemgok.data4n.backtest.Position.SELL))
        profit *= -1;
    
    return isClosed ? profit : 0;
}