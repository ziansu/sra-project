private void generateFrameLayout() {
    int currentOffset = 0;
    for (firm.nodes.Node n : nodeList) {
        edu.kit.ipd.pp.minijavac.codegen.Mode mode = n.getMode();
        if (((mode == (firm.Mode.getIs())) || (mode == (firm.Mode.getBs()))) || (mode == (firm.Mode.getP()))) {
            frameSlots.put(n, currentOffset);
            currentOffset += 8;
        }
    }
    frameSize = currentOffset;
}