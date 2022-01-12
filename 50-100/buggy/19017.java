public void insertNode(com.bridgestone.entity.Node node) {
    java.lang.System.err.println(((("try insert " + (node.getGraphKey())) + " archi ") + (node.getNumberOfEdges())));
    java.util.Map<java.lang.String, com.bridgestone.entity.Node> map = redissonClient.getMap("graphArea");
    if ((map.putIfAbsent(node.getGraphKey(), node)) == null)
        this.updateNode(node);
    
}