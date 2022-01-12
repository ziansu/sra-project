public void addEdge(E e) {
    listEdge.add(e);
    listNode.add(((N) (e.getNodeA())));
    listNode.add(((N) (e.getNodeB())));
}