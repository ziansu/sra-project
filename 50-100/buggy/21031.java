public double calcProbabilitySet(feta.objectmodel.Network net, feta.objectmodel.FetaElement fe, int[] nodes) {
    double prob;
    double totProb = 1.0;
    double probUsed = 0.0;
    for (int n : nodes) {
        prob = calcProbability(n, net, false);
        prob /= 1.0 - probUsed;
        totProb *= prob;
        probUsed += prob;
    }
    return totProb;
}