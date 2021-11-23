@java.lang.Override
public ue5.Biome next() {
    if (hasNext()) {
        if ((yIndex) < ((ue5.World.MAX_NUM_BIOMES) - 1)) {
            (yIndex)++;
            return biome[xIndex][yIndex];
        }else {
            (xIndex)++;
            yIndex = 0;
            return biome[xIndex][yIndex];
        }
    }else {
        throw new java.util.NoSuchElementException(((((("No further biome in array at position: biome[" + (xIndex)) + "]") + "[") + (yIndex)) + "]"));
    }
}