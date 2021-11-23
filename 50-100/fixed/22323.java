public void sampleNewCluster(int k, structures._SparseFeature[] fvs) {
    Classifier.supervised.modelAdaptation.HDP.CLRWithHDP.m_hdpThetaStars[k].enable();
    Classifier.supervised.modelAdaptation.HDP.CLRWithHDP.m_hdpThetaStars[k].initLMStat(m_lmDim);
    double rnd = cern.jet.random.tdouble.Beta.staticNextDouble(1, m_alpha);
    Classifier.supervised.modelAdaptation.HDP.CLRWithHDP.m_hdpThetaStars[k].setGamma((rnd * (m_gamma_e)));
    m_gamma_e = (1 - rnd) * (m_gamma_e);
    swapTheta(m_kBar, k);
    (m_kBar)++;
}