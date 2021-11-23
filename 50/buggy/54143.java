static boolean hasAccuracy(double m, double m_t) {
    return (java.lang.Math.abs((m - m_t))) < (Tool.thre);
}