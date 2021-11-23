private double evalF1(org.uma.jmetal.solution.DoubleSolution solution, double g) {
    double f = 1.0 + g;
    double mult = 1.0;
    for (int i = 1; i <= ((M) - 1); i++) {
        mult *= java.lang.Math.cos((((solution.getVariableValue((i - 1))) * (java.lang.Math.PI)) / 2.0));
    }
    return f * mult;
}