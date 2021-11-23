public void sync() {
    FileTableEntry dirEnt = open("/", "w");
    byte[] dirByte = directory.directory2bytes();
    write(dirEnt, dirByte);
    close(dirEnt);
    superblock.sync();
}