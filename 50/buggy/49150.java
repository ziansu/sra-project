protected static double round(double t) {
    if (t < 1.0E-5) {
        return 0;
    }
    return java.lang.Double.parseDouble(lab.SigFig.sigfigalize(t, 4));
}