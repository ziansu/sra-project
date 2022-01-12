private void generateFrameLayout() {
    int currentOffset = 0;
    for (firm.nodes.Node n : nodeList) {
        edu.kit.ipd.pp.minijavac.codegen.Mode mode = n.getMode();
        if (((mode.equals(firm.Mode.getIs())) || (mode.equals(firm.Mode.getBs()))) || (mode.equals(firm.Mode.getP()))) {
            frameSlots.put(n, currentOffset);
            currentOffset += 8;
        }
    }
    frameSize = currentOffset;
}