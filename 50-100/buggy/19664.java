public synchronized int close(int fd) {
    FileTableEntry fte = convertFdToFtEnt(fd);
    if (fte == null)
        return FileSystem.ERROR;
    
    while ((fte.count) > 1) {
        try {
            wait();
        } catch (java.lang.InterruptedException e) {
        }
    } 
    if ((fte.inode.flag) != (Inode.USED)) {
        SysLib.cout("COUNT EQUALS 1 BUT FLAG NOT SET TO USED IN CLOSE. ");
    }
    fte.inode.toDisk(fte.iNumber);
    return fileTable.ffree(fte) ? 0 : FileSystem.ERROR;
    return 0;
}