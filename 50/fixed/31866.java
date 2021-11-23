protected double childTopicInDocProb(int tid, structures._ChildDoc d) {
    double docLength = d.m_parentDoc.getDocInferLength();
    return (d.m_parentDoc.m_sstat[tid]) / docLength;
}