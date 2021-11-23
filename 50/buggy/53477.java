public double getSum(org.openpixi.pixi.physics.grid.Grid grid) {
    double sum = 0.0;
    for (int i = 0; i < (values.length); i++) {
        sum += values[i];
    }
    return sum;
}