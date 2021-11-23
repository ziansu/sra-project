private double GetProbability() {
    return java.lang.Math.exp(((-(deltaval)) / (temperature)));
}