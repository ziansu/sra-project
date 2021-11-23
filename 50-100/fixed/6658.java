public static void main(final java.lang.String[] args) throws java.io.IOException {
    simulator.graphics_swing.AnimationNetwork an = new simulator.graphics_swing.AnimationNetwork(800, 600, "prova");
    an.setTimer(90);
    an.loadSimulation("Topology/Topology_distributed_singleNode.json", "data/File/Packets.txt");
    an.start();
}