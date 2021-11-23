private void addPrevNode(dat.POGraph.Node prev, java.lang.Integer seq) {
    for (dat.POGraph.Edge edge : prevTransitions)
        if ((edge.getNext().getID()) == (prev.getID())) {
            edge.addSequence(seq);
            return ;
        }
    
    dat.POGraph.Edge prevT = new dat.POGraph.Edge(prev);
    if (seq != null)
        prevT.addSequence(seq);
    
    this.prevTransitions.add(prevT);
}