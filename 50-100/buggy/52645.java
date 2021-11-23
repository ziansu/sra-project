@java.lang.Override
public synchronized simpledb.Page evict() {
    java.util.Iterator<simpledb.Page> pages = this.values();
    while (pages.hasNext()) {
        simpledb.Page page = pages.next();
        if ((page.isDirty()) == null)
            return page;
        
    } 
    return null;
}