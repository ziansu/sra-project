public java.util.List<java.lang.Integer> getPreviousIDs() {
    if ((current) == null)
        return null;
    
    java.util.ArrayList<java.lang.Integer> prevIDs = new java.util.ArrayList<>();
    for (dat.POGraph.Node node : current.getPreviousNodes())
        if ((node.getID()) != (-1))
            prevIDs.add(node.getID());
        
    
    if (prevIDs.isEmpty())
        return null;
    
    return prevIDs;
}