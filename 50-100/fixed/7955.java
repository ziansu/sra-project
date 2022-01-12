public void addNode(controllers.Node node) {
    int floor = node.getFloor();
    allNodes.get((floor - 1)).put(node.getKey(), node);
    if (!(allNodes.get((floor - 1)).containsKey(node.getKey()))) {
        java.lang.System.out.println("COLLECTIONOFNODES: addNode(): added node but then couldn't find in hashmap");
    }else {
    }
}