public boolean doTurn() {
    if ((--(this.turnsLeft)) <= 0) {
        this.techTreeNode.doResearch();
        return true;
    }
    return false;
}