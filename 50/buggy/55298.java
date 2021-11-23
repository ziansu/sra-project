public botLot.lotGraph.LotNode getNodeWithAtt(java.lang.String attKeyIn) {
    for (botLot.lotGraph.LotNode curNode : this.getNodes()) {
        if (!(curNode.hasAtt(attKeyIn))) {
            return curNode;
        }
    }
    return null;
}