public double getSVarS(clus.statistic.ClusAttributeWeights scale) {
    double result = 0.0;
    for (int i = 0; i < (m_NbAttrs); i++) {
        double n_tot = m_SumWeight;
        double sv_tot = m_SumValues[i];
        result += (sv_tot - ((sv_tot * sv_tot) / n_tot)) * (scale.getWeight(m_Attrs[i]));
    }
    return result / (m_NbAttrs);
}