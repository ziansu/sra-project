@java.lang.Override
public void setupNeighbours(de.hsb.smaevers.para.nodes.Node... neighbours) {
    if (neighbours != null) {
        for (de.hsb.smaevers.para.nodes.Node node : neighbours) {
            node.hello(this);
            this.neighbours.add(node);
        }
    }
    startLatch.countDown();
}