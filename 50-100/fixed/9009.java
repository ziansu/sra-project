public java.util.ArrayList<graph.Vector> getVectorsPointingAway(graph.Point p) {
    java.util.ArrayList<graph.Vector> vs = new java.util.ArrayList<>();
    for (int i = 0; i < (getEdges().size()); i++) {
        if (getEdges().get(i).getP1().equals(p)) {
            vs.add(getEdges().get(i));
        }
    }
    return vs;
}