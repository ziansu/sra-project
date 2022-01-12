public com.minespaceships.mod.spaceship.BlockMap getRotatedMap(net.minecraft.util.BlockPos origin, net.minecraft.util.BlockPos addDirection, int turn) {
    if (turn == 0) {
        this.origin = this.origin.add(addDirection);
        return this;
    }
    com.minespaceships.mod.spaceship.BlockMap nextMap = new com.minespaceships.mod.spaceship.BlockMap(this.origin);
    java.util.ArrayList<net.minecraft.util.BlockPos> positions = getPositions();
    for (net.minecraft.util.BlockPos pos : positions) {
        net.minecraft.util.BlockPos nextPos = com.minespaceships.mod.spaceship.Turn.getRotatedPos(pos, origin, addDirection, turn);
        nextMap.add(nextPos);
    }
    return nextMap;
}