private void setTimestamp(int x, int z, int value) throws java.io.IOException {
    this.chunkTimestamps[(x + (z * 32))] = value;
    this.file.seek(((org.lanternpowered.server.data.io.anvil.RegionFile.SECTOR_BYTES) + ((x + (z * 32)) * 4)));
    this.file.writeInt(value);
}