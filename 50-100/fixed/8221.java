private double productionDeut(int lvl) {
    double tempmod = 1.44 - (0.004 * (Versorgung[11]));
    return java.lang.Math.round((((((double) (10)) * lvl) * (java.lang.Math.pow(1.1, lvl))) * tempmod));
}