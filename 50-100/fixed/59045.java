public boolean isSameNode(aStar.Node node) {
    if (((((this.x) == (node.x)) && ((this.y) == (node.y))) && ((this.gCost) == (node.gCost))) && ((this.hCost) == (node.hCost)))
        return true;
    
    return false;
}