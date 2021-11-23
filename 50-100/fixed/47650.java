private boolean pointWithinChunk(int x, int z, int cx, int cz) {
    return (((x > cx) && (x < (cx + 16))) && (z > cz)) && (z < (cz + 16));
}