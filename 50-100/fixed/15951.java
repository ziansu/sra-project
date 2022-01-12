@java.lang.Override
public short getBlockAt(int relativeX, int relativeY, int relativeZ) {
    return (((((relativeX < (Chunk.X_MAX)) && (relativeY < (Chunk.Y_MAX))) && (relativeZ < (Chunk.Z_MAX))) && (relativeX > (-1))) && (relativeY > (-1))) && (relativeZ > (-1)) ? blocks[relativeX][relativeY][relativeZ] : BlockType.AIR.getBlockId();
}