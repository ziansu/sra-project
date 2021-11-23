private double scale(double num, double min, double max, double limitMin, double limitMax) {
    return (((limitMax - limitMin) * (num - min)) / (max - min)) + limitMin;
}