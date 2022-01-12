public boolean shouldChange(double ynew, double yold, double localTemp) {
    double exp = java.lang.Math.exp(((-(ynew - yold)) / localTemp));
    double val = java.util.concurrent.ThreadLocalRandom.current().nextDouble(0, 1);
    if (val < exp) {
        return true;
    }else {
        return false;
    }
}