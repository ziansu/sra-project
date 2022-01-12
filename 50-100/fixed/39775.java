@java.lang.Override
public boolean hasNext() {
    if (((xIndex) == (ue5.World.MAX_NUM_BIOMES)) && ((yIndex) == (ue5.World.MAX_NUM_BIOMES))) {
        return false;
    }
    if ((biome[xIndex][yIndex]) == null) {
        return false;
    }
    return true;
}