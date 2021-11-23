private void removeChild(int index) {
    org.oddjob.monitor.model.JobTreeNode child = nodeList.remove(index);
    model.fireTreeNodesRemoved(this, child, index);
}