public static boolean isWoodLogLayer(net.minecraft.world.chunk.Chunk chunk, int x, int y, int z, int size) {
    boolean allWood = true;
    for (int xI = x; xI <= (x + size); xI++) {
        for (int zI = z; zI <= (z + size); zI++) {
            allWood &= com.algorim.treegrowth.utilities.Common.isWoodLog(chunk, xI, y, zI);
        }
    }
    return allWood;
}