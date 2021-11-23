public double computeAET(double S_i, double ETp) throws java.io.IOException {
    double Emod = java.lang.Math.max(0, (ETp * (java.lang.Math.min(1, ((1.33 * S_i) / (s_RootZoneMax))))));
    return Emod;
}