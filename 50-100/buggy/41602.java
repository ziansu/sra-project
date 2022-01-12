private void registerBridge(int i, int j, org.biojava.nbio.structure.secstruc.BridgeType btype) {
    if (i > j) {
        org.biojava.nbio.structure.secstruc.SecStrucPred.logger.error(("Trying to connect BetaBridge where i > j. " + "Swapping indices..."));
        int tmp = i;
        i = j;
        j = tmp;
    }
    org.biojava.nbio.structure.secstruc.BetaBridge bridge = new org.biojava.nbio.structure.secstruc.BetaBridge();
    bridge.partner1 = i;
    bridge.partner2 = j;
    bridge.type = btype;
    getSecStrucState(i).setBridge(bridge);
    getSecStrucState(j).setBridge(bridge);
    bridges.add(bridge);
}