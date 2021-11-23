private void registerBridge(int i, int j, org.biojava.nbio.structure.secstruc.BridgeType btype) {
    org.biojava.nbio.structure.secstruc.BetaBridge bridge = new org.biojava.nbio.structure.secstruc.BetaBridge(i, j, btype);
    getSecStrucState(i).setBridge(bridge);
    getSecStrucState(j).setBridge(bridge);
    bridges.add(bridge);
}