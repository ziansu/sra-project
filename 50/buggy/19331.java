public void onAttached() {
    this.lastRail = this.rail = findInfo(this.owner);
    this.lastRailLogic = this.railLogic = null;
    this.railLogicSnapshotted = false;
}