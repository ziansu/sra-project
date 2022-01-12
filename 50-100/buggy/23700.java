public java.lang.Integer[] getPreviousNodeIDs(int id) {
    graph.setCurrent(id);
    java.lang.Integer[] ids = new java.lang.Integer[graph.getPrevIDs().size()];
    graph.getPrevIDs().toArray(ids);
    return ids;
}