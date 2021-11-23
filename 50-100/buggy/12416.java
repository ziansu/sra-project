public void write_page(global.PageId pageno, global.Page mempage) {
    if (((pageno.pid) < 0) || ((pageno.pid) >= (num_db_pages))) {
        throw new java.lang.IllegalArgumentException("Invalid page number; write aborted");
    }
    try {
        fp.seek(((long) ((pageno.pid) * (PAGE_SIZE))));
        fp.write(mempage.getData());
        (write_cnt)++;
    } catch (java.io.IOException exc) {
        global.Minibase.haltSystem(exc);
    }
}