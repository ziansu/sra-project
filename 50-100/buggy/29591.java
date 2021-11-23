public boolean removeResEdge(datastructures.flownetwork.FlowVertex startVertex) {
    if (this.containsResEdge(startVertex)) {
        datastructures.flownetwork.FlowEdge oldEdge = this.getResEdge(startVertex);
        if (oldEdge != null) {
            library.StdOut.println(((("Removed Res Id: " + (this.id())) + ", Id: ") + (startVertex.id())));
            resAdjacencyList.remove(oldEdge);
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}