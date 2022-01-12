public static void createBridge(java.util.TreeMap<java.lang.Long, de.javamaps.Vertex> graph) {
    for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.Long>> e : de.javamaps.MotorwayRamp.getMotorwayRamps(graph).entrySet()) {
        for (java.lang.Long id : e.getValue()) {
            de.javamaps.Vertex actual = graph.get(id);
            for (java.lang.Long idNewN : e.getValue()) {
                if (idNewN != id) {
                    actual.addNeighbor(new de.javamaps.Neighbor(idNewN, 1));
                }
            }
        }
    }
}