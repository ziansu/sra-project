public double getSimilarity(structures._Doc di, structures._Doc dj) {
    int topicSize = di.m_topics.length;
    return java.lang.Math.exp(((utils.Utils.calculateSimilarity(di, dj)) - ((utils.Utils.KLsymmetric(di.m_topics, dj.m_topics)) / topicSize)));
}