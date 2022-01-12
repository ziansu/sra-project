public com.twinity.PlanetWarsServer.Node[] getOpponentNodes(int inMyId) {
    java.util.ArrayList<com.twinity.PlanetWarsServer.Node> opponentNodes = new java.util.ArrayList<>();
    for (com.twinity.PlanetWarsServer.Node node : this.getAllNodes())
        if (((node.getOwner()) != inMyId) && ((node.getOwner()) != 0)) {
            opponentNodes.add(node);
        }
    
    return opponentNodes.toArray(new com.twinity.PlanetWarsServer.Node[opponentNodes.size()]);
}