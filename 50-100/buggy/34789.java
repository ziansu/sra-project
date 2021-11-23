public void mount(java.lang.String diskName) {
    diskUnit = diskUtilities.DiskUnit.mount(diskName);
    capacity = diskUnit.getCapacity();
    blockSize = diskUnit.getBlockSize();
    freeBlockIndex = diskUnit.getFreeBlockIndex();
    endOfFreeBlockIndex = diskUnit.getEndOfFreeBlockIndex();
    firstFreeINode = diskUnit.getFirstFreeINode();
    totalINodes = diskUnit.getTotalINodes();
    currentDirectory = getINodeIndexAtDirectoryIndex(blockSize);
    mountName = diskName;
}