public void flee() {
    cooldownWalk = 500;
    if (((actAction) != 1) || (fleePath.isEmpty())) {
        pp2016.team19.shared.Node fleePos = getFleePos();
        fleePath.clear();
        if (fleePos != null) {
            fleePath = AStarSearch(this.getXPos(), this.getYPos(), fleePos.getXPos(), fleePos.getYPos());
        }
    }
    changeDir(fleePath);
    actAction = 1;
}