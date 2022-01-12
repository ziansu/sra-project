public boolean execute() {
    if (((this.game.getFrameCount()) - (this.startFrame)) > 1000) {
        this.activeBuildPlans.remove(this);
        this.buildingQueue.add(this);
    }
    return this.builder.build(this.building, this.buildingTile);
}