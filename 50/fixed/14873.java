public boolean isStartNode(RaceAI.AI.Node node) {
    if (((this.startNode.x) == (node.x)) && ((this.startNode.y) == (node.y)))
        return true;
    else
        return false;
    
}