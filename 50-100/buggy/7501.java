public boolean isEndNode(RaceAI.AI.Node node) {
    if (((this.endNode.x) == (node.x)) && ((this.endNode.y) <= (node.y)))
        return true;
    else
        return false;
    
}