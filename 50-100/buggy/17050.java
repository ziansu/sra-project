protected double parentChildInfluenceProb(int tid, structures._ParentDoc d) {
    double term = 1;
    if (m_collectCorpusStats) {
        return term;
    }
    if (tid == 0)
        return term;
    
    for (structures._ChildDoc cDoc : d.m_childDocs) {
        term *= influenceRatio(d.m_sstat[tid], d.m_sstat[0]);
    }
    return term;
}