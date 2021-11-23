public double classify(weka.core.Instance instance) {
    double resultClass;
    weka.core.Instances neighbors = findNearestNeighbors(instance, m_currK);
    if ((M_DISTFUNC) == (hw4.Knn.NON_WEIGHTED))
        resultClass = getClassVoteResult(neighbors);
    else
        resultClass = getWeightedClassVoteResult(neighbors, instance);
    
    return resultClass;
}