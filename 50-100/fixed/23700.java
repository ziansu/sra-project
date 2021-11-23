public java.lang.Integer[] getPreviousNodeIDs(int id) {
    if (!(graph.setCurrent(id)))
        return null;
    
    java.lang.Integer[] ids = new java.lang.Integer[graph.getPrevIDs().size()];
    graph.getPrevIDs().toArray(ids);
    return ids;
}