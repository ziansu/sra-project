public synchronized int close(int fd) {
    FileTableEntry fte = null;
    if ((myTcb = Kernel.scheduler.getMyTcb()) != null)
        fte = myTcb.getFtEnt(fd);
    
    if (fte == null)
        return FileSystem.ERROR;
    
    if ((fte.count) > 0)
        (fte.count)--;
    else {
        fte.inode.flag = Inode.USED;
        fte.inode.toDisk(fte.iNumber);
        return fileTable.ffree(fte) ? 0 : FileSystem.ERROR;
    }
    return 0;
}