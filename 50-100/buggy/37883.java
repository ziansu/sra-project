public int getBandwidth() {
    return this.getEdges().stream().mapToInt((graph.Edge edge) -> edge instanceof cluster.Cable ? ((cluster.Cable) (edge)).getCapacity() : Integer.MAX_VALUE).min().getAsInt();
}