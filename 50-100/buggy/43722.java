public void removeBlock(int x, int y, int z) {
    if ((heightMap[x][z]) == y) {
        heightMap[x][z] = findHeight(x, z, y);
    }
    data[x][y][z] = blockTypeField.setValue(data[x][y][z], 0);
    markDirty();
}