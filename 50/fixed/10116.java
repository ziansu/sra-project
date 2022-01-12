static double[] processAccelrometerData(double[] data) {
    for (int i = 0; i < 3; i++) {
        data[i] *= 386.088;
    }
    return data;
}