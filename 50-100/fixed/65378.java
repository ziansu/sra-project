public java.lang.Double getCost() {
    if ((cost) == 0.0)
        for (Edge e : this.getEdges()) {
            if ((e.getCost()) != null) {
                cost += (e.getCost()) * (e.getFlow());
            }else {
                return cost;
            }
        }
    
    return cost;
}