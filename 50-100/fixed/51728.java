private static double getTaoSigma() {
    double answer = ((((((4 * (java.lang.Math.PI)) * (main.Calculation.sigma)) * (main.Calculation.kappa)) * (main.Calculation.kappa)) * (main.Calculation.R)) * (main.Calculation.R)) / ((15 * (main.Calculation.c)) * (main.Calculation.c));
    answer *= (main.Calculation.gamma) * (main.Calculation.Ha);
    return answer;
}