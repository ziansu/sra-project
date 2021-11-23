private void increaseInhabitedTime(net.minecraft.world.chunk.Chunk theChunk) {
    theChunk.setInhabitedTime((((theChunk.getInhabitedTime()) + (theShipWorldServer.getTotalWorldTime())) - (this.previousWorldTime)));
    this.previousWorldTime = theShipWorldServer.getTotalWorldTime();
}