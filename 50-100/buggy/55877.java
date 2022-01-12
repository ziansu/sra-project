public void addChild(int index, java.lang.Object childJob) {
    org.oddjob.monitor.model.JobTreeNode childNode = new org.oddjob.monitor.model.JobTreeNode(this, childJob);
    if (visible) {
        childNode.setVisible(true);
    }
    nodeList.add(index, childNode);
    model.fireTreeNodesInserted(this, childNode, index);
}