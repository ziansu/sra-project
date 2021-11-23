@java.lang.Override
public void run() throws java.lang.IllegalStateException {
    if ((((this.startNode) == (-1)) || ((this.endNode) == (-1))) || ((this.graph) == null)) {
        throw new java.lang.IllegalStateException("Es wurden noch keine Daten gesetzt");
    }else {
        if (this.startNodeChanged) {
            init();
            distanz_update();
            createShortestPath();
            this.startNodeChanged = false;
        }else {
            createShortestPath();
        }
    }
}