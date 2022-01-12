private void setTimestamp(int x, int z, int value) throws java.io.IOException {
    chunkTimestamps[(x + (z * 32))] = value;
    file.seek(((org.lanternpowered.server.data.io.anvil.RegionFile.SECTOR_BYTES) + ((x + (z * 32)) * 4)));
    file.writeInt(value);
}