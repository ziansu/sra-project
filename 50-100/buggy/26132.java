public synchronized void unmarkBlocks(net.minecraft.entity.player.EntityPlayerMP caller, java.lang.Object key) {
    for (mytown.handlers.VisualsHandler.VisualObject visualObject : markedBlocks) {
        if (((visualObject.player) == caller) && ((visualObject.object) == key)) {
            MyTown.instance.LOG.info(("Unmarked blocks for key " + (key.toString())));
            for (mytown.handlers.VisualsHandler.BlockCoords blockCoords : visualObject.blockCoords)
                blockCoords.deleted = true;
            
        }
        MyTown.instance.LOG.info(("There is: " + (key.toString())));
    }
}