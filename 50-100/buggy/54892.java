public void convertToReducible(org.teavm.common.irreducible.Graph cfg, int[] weight, org.teavm.common.irreducible.GraphSplittingBackend backend) {
    this.backend = backend;
    int[] identityNodeMap = new int[cfg.size()];
    for (int i = 0; i < (identityNodeMap.length); ++i) {
        identityNodeMap[i] = i;
    }
    this.cfg = cfg;
    this.cfgWeight = weight;
    handleLoops(new org.teavm.common.irreducible.DJGraph(cfg, weight), identityNodeMap);
    this.backend = null;
}