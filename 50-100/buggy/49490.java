private void expandAndSelect(org.opentravel.schemas.node.Node node) {
    java.util.LinkedList<org.opentravel.schemas.node.Node> parents = new java.util.LinkedList<org.opentravel.schemas.node.Node>();
    while ((viewer.testFindItem(node)) == null) {
        node = node.getParent();
        if (node == null) {
            return ;
        }
        parents.addFirst(node);
    } 
    for (org.opentravel.schemas.node.Node p : parents) {
        viewer.expandToLevel(p, 1);
    }
}