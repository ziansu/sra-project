private double evalG(org.uma.jmetal.solution.DoubleSolution solution, int limitInf) {
    double g = 0.0;
    double Gt = java.lang.Math.abs(java.lang.Math.sin(((0.5 * (java.lang.Math.PI)) * (time))));
    for (int i = 0; i < (solution.getNumberOfVariables()); i++) {
        g += java.lang.Math.pow(((solution.getVariableValue(i)) - Gt), 2.0);
    }
    return g;
}