private double calculateSquaredNorm(final T row) {
    double norm = 0.0;
    for (int i = 0; i < (m_nFets); i++) {
        double fet = row.getFeature(i);
        norm += fet * fet;
    }
    return norm;
}