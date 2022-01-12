public double r() {
    this.update();
    return (((n) * (sumXY)) - ((sumX) * (sumY))) / (java.lang.Math.sqrt(((((n) * (sumX2)) - (java.lang.Math.pow(sumX, 2))) * (((n) * (sumY2)) - (java.lang.Math.pow(sumY, 2))))));
}