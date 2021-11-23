protected double parentChildInfluenceProb(int tid, structures._ParentDoc pDoc) {
    double term = 1.0;
    if (m_collectCorpusStats) {
        return term;
    }
    if (tid == 0)
        return term;
    
    for (structures._ChildDoc cDoc : pDoc.m_childDocs) {
        term *= influenceRatio(pDoc.m_sstat[tid], pDoc.m_sstat[0]);
    }
    return term;
}