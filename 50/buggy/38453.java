protected int getIndex(int x, int y) {
    return (x * y) % (skyboxTextures.length);
}