public void markBlock(int x, int y, int z, int dim, net.minecraft.block.Block block, java.lang.Object key) {
    if ((markedBlocks.get(key)) == null) {
        markedBlocks.put(key, new java.util.ArrayList<mytown.handlers.VisualsTickHandler.BlockCoords>());
    }
    markedBlocks.get(key).add(new mytown.handlers.VisualsTickHandler.BlockCoords(x, y, z, dim, block));
}