public boolean canConnect(ca.mcgill.cs.stg.jetuml.graph.Edge pEdge, ca.mcgill.cs.stg.jetuml.graph.Node pNode1, ca.mcgill.cs.stg.jetuml.graph.Node pNode2) {
    if (pNode2 == null) {
        return false;
    }
    if (((pNode2 instanceof ca.mcgill.cs.stg.jetuml.graph.NoteNode) || (pNode1 instanceof ca.mcgill.cs.stg.jetuml.graph.NoteNode)) && (!(pEdge instanceof ca.mcgill.cs.stg.jetuml.graph.NoteEdge))) {
        return false;
    }
    if ((pEdge instanceof ca.mcgill.cs.stg.jetuml.graph.NoteEdge) && (!((pNode1 instanceof ca.mcgill.cs.stg.jetuml.graph.NoteNode) || (pNode2 instanceof ca.mcgill.cs.stg.jetuml.graph.NoteNode)))) {
        return false;
    }
    return true;
}