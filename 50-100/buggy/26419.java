private void write(int sectorNumber, byte[] data, int length) throws java.io.IOException {
    file.seek((sectorNumber * (org.lanternpowered.server.data.io.anvil.RegionFile.SECTOR_BYTES)));
    file.writeInt((length + 1));
    file.writeByte(org.lanternpowered.server.data.io.anvil.RegionFile.VERSION_DEFLATE);
    file.write(data, 0, length);
}