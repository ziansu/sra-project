public void removeBlock(int x, int y, int z) {
    data[x][y][z] = blockTypeField.setValue(data[x][y][z], 0);
    if ((heightMap[x][z]) == y) {
        heightMap[x][z] = findHeight(x, z, y);
    }
    markDirty();
}