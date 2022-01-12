private void increaseInhabitedTime(net.minecraft.world.chunk.Chunk theChunk) {
    theChunk.setInhabitedTime((((theChunk.getInhabitedTime()) + (this.theShipWorldServer.getTotalWorldTime())) - (previousWorldTime)));
    previousWorldTime = this.theShipWorldServer.getTotalWorldTime();
}