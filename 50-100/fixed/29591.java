public boolean removeResEdge(datastructures.flownetwork.FlowVertex startVertex) {
    if (this.containsResEdge(startVertex)) {
        datastructures.flownetwork.FlowEdge oldEdge = this.getResEdge(startVertex);
        if (oldEdge != null) {
            resAdjacencyList.remove(oldEdge);
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}