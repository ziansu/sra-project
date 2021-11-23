private double bubosCost(double currLevel, double newLevel) {
    double cost = 0.0;
    for (double n = currLevel + 1.0; n <= newLevel; n++) {
        cost += 4.0 * (java.lang.Math.pow(2.0, (n - 1.0)));
    }
    return cost;
}