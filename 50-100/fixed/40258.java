public global.PageId newPage(global.Page firstpage, int howmany) {
    global.PageId pid = new global.PageId();
    try {
        Minibase.DiskManager.allocate_page(pid, howmany);
        pinPage(pid, firstpage, false);
    } catch (java.lang.Exception e) {
        return null;
    }
    return pid;
}