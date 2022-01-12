public global.PageId newPage(global.Page firstpage, int howmany) {
    global.PageId pid = new global.PageId();
    try {
        Minibase.DiskManager.allocate_page(pid, howmany);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (chainexception.ChainException e) {
        e.printStackTrace();
    }
    try {
        pinPage(pid, firstpage, false);
    } catch (bufmgr.HashEntryNotFoundException e) {
        return null;
    }
    return pid;
}