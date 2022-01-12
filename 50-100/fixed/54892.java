public void convertToReducible(org.teavm.common.irreducible.Graph cfg, int[] weight, org.teavm.common.irreducible.GraphSplittingBackend backend) {
    this.backend = backend;
    int[][] identityNodeMap = new int[cfg.size()][];
    for (int i = 0; i < (identityNodeMap.length); ++i) {
        identityNodeMap[i] = new int[]{ i };
    }
    this.cfg = cfg;
    handleLoops(new org.teavm.common.irreducible.DJGraph(cfg, weight), identityNodeMap);
    this.backend = null;
}