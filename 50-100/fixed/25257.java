private void wakeup() throws java.rmi.RemoteException {
    long minWeight = java.lang.Long.MAX_VALUE;
    distributed.mst.Edge minEdge = null;
    for (distributed.mst.Edge e : edges) {
        if ((e != null) && ((e.weight) < minWeight)) {
            minWeight = e.weight;
            minEdge = e;
        }
    }
    minEdge.state = EdgeState.InMST;
    unknownEdges.remove(minEdge);
    inMSTEdges.add(minEdge);
    level = 0;
    state = State.Found;
    findCount = 0;
    minEdge.process.connect(myId, 0);
}