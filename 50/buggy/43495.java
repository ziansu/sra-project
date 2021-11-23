private double solomonCost(double currLevel, double newLevel) {
    double cost = 0.0;
    for (double n = currLevel + 1.0; n <= newLevel; n++) {
        cost += java.lang.Math.pow(n, 1.5);
    }
    return cost;
}