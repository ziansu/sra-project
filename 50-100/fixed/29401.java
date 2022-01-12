@java.lang.Override
int runAlgorithm(float stockLevel) {
    if ((secondCounter) == 1) {
        prevStockLevel = stockLevel;
        return 0;
    }
    float diff = stockLevel - (prevStockLevel);
    prevStockLevel = stockLevel;
    return diff >= 0 ? riskNumber : (-1) * (riskNumber);
}