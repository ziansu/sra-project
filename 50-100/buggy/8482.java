private double calcMaxMana(int level) {
    if (level < 10) {
        return 0;
    }
    double a = java.lang.Math.pow(1.01, (level / 10));
    double b = 0.01 * ((java.lang.Math.pow(1.15, (level - 10))) - 1);
    return (java.lang.Math.log((a + b))) / (java.lang.Math.log(1.0001));
}