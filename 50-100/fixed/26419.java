private void write(int sectorNumber, byte[] data, int length) throws java.io.IOException {
    this.file.seek((sectorNumber * (org.lanternpowered.server.data.io.anvil.RegionFile.SECTOR_BYTES)));
    this.file.writeInt((length + 1));
    this.file.writeByte(org.lanternpowered.server.data.io.anvil.RegionFile.VERSION_DEFLATE);
    this.file.write(data, 0, length);
}