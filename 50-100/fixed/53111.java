public boolean add(com.eep.taxe.models.Vertex vertex) {
    if (((this.getCurrentLastVertex()) == null) && (vertex instanceof com.eep.taxe.models.Station)) {
        this.setStartingStation(((com.eep.taxe.models.Station) (vertex)));
        this.setCurrentLastVertex(vertex);
        return true;
    }
    com.eep.taxe.models.Edge connectingEdge = this.getCurrentLastVertex().getEdge(vertex);
    if (connectingEdge != null) {
        this.add(connectingEdge);
        return true;
    }
    return false;
}