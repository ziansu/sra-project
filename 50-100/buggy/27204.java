public void addEdge(E e) {
    if (!(listEdge.contains(e)))
        listEdge.add(e);
    
    if (!(listNode.contains(e.getNodeA())))
        listNode.add(((N) (e.getNodeA())));
    
    if (!(listNode.contains(e.getNodeB())))
        listNode.add(((N) (e.getNodeB())));
    
}