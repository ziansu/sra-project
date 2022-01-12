public void flushPage(global.PageId pageno) {
    if (pageFrameMap.containsKey(pageno.pid)) {
        java.lang.Integer frameNo = pageFrameMap.get(pageno.pid);
        if (frameNo != null) {
            if (frametab[frameNo].dirty) {
                Minibase.DiskManager.write_page(pageno, buffer_pool[frameNo]);
            }
        }else {
            throw new java.lang.IllegalArgumentException("Page is not in the buffer pool!");
        }
    }
}