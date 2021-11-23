public int getSteinerPointsNeeded(double range) {
    int steinerPointsNeeded = 0;
    for (edu.asu.anisha.core.Edge edge : this.getEdges()) {
        steinerPointsNeeded += (java.lang.Math.ceil(((edge.getWeight()) / range))) - 1;
    }
    return steinerPointsNeeded;
}