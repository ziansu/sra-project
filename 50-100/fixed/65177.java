protected void copleteGraph_and_EdgeCount() {
    for (int i = 0; i < (nodeCount); i++) {
        totalEdge += node[i].getNodeDegree();
    }
    totalEdge /= 2;
    totalEdgeCountBack.setText(totalEdge);
    if ((totalEdge) != (((nodeCount) * ((nodeCount) - 1)) / 2))
        completeGraphBack.setText("HAYIR");
    else
        completeGraphBack.setText("EVET");
    
}