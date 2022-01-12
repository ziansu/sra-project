public botLot.lotGraph.LotNode getNodeWithAtt(java.lang.String attKeyIn, java.lang.String attValIn) {
    for (botLot.lotGraph.LotNode curNode : this.getNodes()) {
        if (curNode.hasAtt(attKeyIn, attValIn)) {
            return curNode;
        }
    }
    return null;
}