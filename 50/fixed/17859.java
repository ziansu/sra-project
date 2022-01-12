public double UniformAB(double lower, double upper) {
    RandomNumber();
    RandomNumber();
    return java.lang.Math.floor((lower + ((upper - lower) * (RandomNumber()))));
}