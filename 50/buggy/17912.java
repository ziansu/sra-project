public void sync() {
    FileTableEntry dirEnt = open("/", "w");
    byte[] dirByte = directory.directory2bytes();
    write(dirEnt, dirByte);
    close(dirByte);
    superblock.sync();
}