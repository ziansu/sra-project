public void drawNetwork(final uk.ac.uea.cmp.spectre.core.ds.network.draw.ViewerConfig config, uk.ac.uea.cmp.spectre.core.ds.network.Network network, boolean optimiseLayout) {
    this.network = network;
    this.config = config;
    this.setGraph();
    this.showTrivial(config.showTrivial());
    this.repaintOnResize();
    if (optimiseLayout) {
        this.optimiseScale(true);
    }
    this.repaintOnResize();
}