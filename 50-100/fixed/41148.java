public synchronized void addOneEndNode(com.wpi.cs509.teamA.bean.Node pendNode) {
    if (null == (this.endNode)) {
        endNode = new java.util.ArrayList<com.wpi.cs509.teamA.bean.Node>();
    }
    this.endNode.add(pendNode);
    this.endNearestNodes = null;
    modelChanged();
}