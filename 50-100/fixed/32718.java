public double calcBuildupIndex() {
    BUI = (-50) * (java.lang.Math.log((1 - (((java.lang.Math.E) * ((-(BUO)) / 50)) * (java.lang.Math.exp(((-1.175) * ((PRECIP) - 0.1))))))));
    if ((BUI) < 0) {
        BUI = 0;
    }
    return BUI;
}