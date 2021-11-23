public java.lang.Double getCost() {
    if (this.cost.equals(0.0)) {
        for (Edge e : this.getEdges()) {
            cost += (e.getCost()) * (e.getFlow());
        }
    }
    return cost;
}