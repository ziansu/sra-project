public bufmgr.PageId newPage(bufmgr.Page firstpage, int howmany) throws chainexception.ChainException {
    bufmgr.PageId id = new bufmgr.PageId();
    try {
        Minibase.DiskManager.allocate_page(id, howmany);
    } catch (java.lang.Exception e) {
        throw new bufmgr.DiskMgrException(e, (("Unable to allocate " + howmany) + " pages."));
    }
    pinPage(id, firstpage, false);
    return id;
}