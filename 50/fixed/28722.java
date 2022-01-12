public void setNodes(java.util.List<org.esn.mobilit.models.Node> nodes, org.esn.mobilit.models.Node currentNode) {
    this.nodes = (nodes != null) ? nodes : new java.util.ArrayList<org.esn.mobilit.models.Node>();
    this.currentNode = currentNode;
    this.notifyDataSetChanged();
}