public java.io.DataOutputStream getChunkDataOutputStream(int x, int z) {
    checkBounds(x, z);
    return new java.io.DataOutputStream(new java.io.BufferedOutputStream(new java.util.zip.DeflaterOutputStream(new org.lanternpowered.server.data.io.anvil.RegionFile.ChunkBuffer(x, z), new java.util.zip.Deflater(java.util.zip.Deflater.BEST_SPEED))));
}