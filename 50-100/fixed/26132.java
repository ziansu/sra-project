public synchronized void unmarkBlocks(net.minecraft.entity.player.EntityPlayerMP caller, java.lang.Object key) {
    for (mytown.handlers.VisualsHandler.VisualObject visualObject : markedBlocks) {
        if (((visualObject.player) == caller) && ((visualObject.object) == key)) {
            for (mytown.handlers.VisualsHandler.BlockCoords blockCoords : visualObject.blockCoords)
                blockCoords.deleted = true;
            
        }
    }
}