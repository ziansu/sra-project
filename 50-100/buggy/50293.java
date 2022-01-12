public void flushPage(global.PageId pageno) {
    if (pageFrameMap.containsKey(pageno.pid)) {
        java.lang.Integer frameNo = pageFrameMap.get(pageno.pid);
        if (frameNo != null) {
            if (frametab[frameNo].dirty) {
                java.lang.System.out.println(((("psgeno: " + (pageno.pid)) + " frame: ") + frameNo));
                Minibase.DiskManager.write_page(pageno, buffer_pool[frameNo]);
            }
        }else {
            throw new java.lang.IllegalArgumentException("Page is not in the buffer pool!");
        }
    }
}