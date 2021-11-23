public double getBodyWaterConstant(int gender) {
    double bodyWater;
    if (gender == 2) {
        bodyWater = 0.49;
    }else {
        bodyWater = 0.58;
    }
    return bodyWater;
}