public java.util.List<java.lang.Integer> getPreviousIDs() {
    java.util.ArrayList<java.lang.Integer> prevIDs = new java.util.ArrayList<>();
    if ((current) == null)
        return prevIDs;
    
    for (dat.POGraph.Node node : current.getPreviousNodes())
        if ((node.getID()) != (-1))
            prevIDs.add(node.getID());
        
    
    return prevIDs;
}