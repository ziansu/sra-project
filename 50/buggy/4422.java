private double pollutionDecay(double pollution) {
    double value = pollution - (pollution / (2 * (edu.mscd.thesis.util.Rules.POLLUTION_HALFLIFE)));
    return edu.mscd.thesis.util.Util.boundValue(value, 0, Rules.MAX);
}