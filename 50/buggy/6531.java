public boolean isBesideClimbableBlock() {
    return ((this.dataWatcher.getWatchableObjectByte(16)) & 1) != 0;
}