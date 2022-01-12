public boolean execute() {
    if (((game.getFrameCount()) - (startFrame)) > 1000) {
        activeBuildPlans.remove(this);
        buildingQueue.add(this);
    }
    return this.builder.build(this.building, this.buildingTile);
}