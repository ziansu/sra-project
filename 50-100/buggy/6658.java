public static void main(final java.lang.String[] args) throws java.io.IOException {
    simulator.graphics.plotter.Plotter plotter = new simulator.graphics.plotter.Plotter("prova", 800, 600);
    plotter.addPlot("/home/stefano/test.txt", null, "test.txt");
    plotter.setVisible(true);
    simulator.graphics_swing.AnimationNetwork an = new simulator.graphics_swing.AnimationNetwork(800, 600, "prova");
    an.setTimer(90);
    an.loadSimulation("Topology/Topology_distributed_singleNode.json", "data/File/Packets.txt");
    an.start();
}