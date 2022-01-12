private void clearInternalBlocks(boolean chunkUnloading) {
    for (forestry.api.greenhouse.ILogicBlockHandler handler : getHandlers()) {
        handler.clearBlocks(this, chunkUnloading, startPos);
    }
    blockCount = 0;
}