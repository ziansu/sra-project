public double sigmoid(double x) {
    double res = 1 / (1 + (java.lang.Math.exp((-x))));
    java.lang.System.out.println(("activation: " + res));
    return res;
}