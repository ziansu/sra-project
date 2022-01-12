private ca.mcgill.cs.stg.jetuml.graph.Node deepFindNode(ca.mcgill.cs.stg.jetuml.graph.Node pNode, java.awt.geom.Point2D pPoint) {
    ca.mcgill.cs.stg.jetuml.graph.Node node = null;
    if (pNode instanceof ca.mcgill.cs.stg.jetuml.graph.ParentNode) {
        for (ca.mcgill.cs.stg.jetuml.graph.Node child : ((ca.mcgill.cs.stg.jetuml.graph.ParentNode) (pNode)).getChildren()) {
            node = deepFindNode(child, pPoint);
            if (node != null) {
                return node;
            }
        }
    }
    if (pNode.contains(pPoint)) {
        return pNode;
    }else {
        return null;
    }
}