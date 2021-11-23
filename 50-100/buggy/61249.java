public void freePage(global.PageId pageno) {
    if (pageFrameMap.containsKey(pageno.pid)) {
        java.lang.Integer frameNo = pageFrameMap.get(pageno.pid);
        if ((frameNo != null) && ((frametab[frameNo].pin_count) > 0)) {
            throw new java.lang.IllegalArgumentException("The page is pinned!");
        }else {
            Minibase.DiskManager.deallocate_page(pageno);
        }
    }
}