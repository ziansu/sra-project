public void setupGeneTrees(phylonet.coalescent.WQInference wqInference, boolean randomResolve) {
    this.algorithm.setupGeneTrees(wqInference, false);
    tmpalgorithm.setupGeneTrees(wqInference, false);
}