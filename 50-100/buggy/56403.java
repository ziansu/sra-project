public void savePage(ru.spbau.mit.memory.Page page) throws java.io.IOException {
    assert (page.getId()) < (pageCount);
    if (!(page.isDirty()))
        return ;
    
    page.close();
    takeToPageStart(page);
    file.write(page.getData(), 0, Page.SIZE);
}