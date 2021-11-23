@java.lang.Override
public com.pratilipi.data.type.doc.Page addPage(com.pratilipi.data.type.doc.PageletType type, java.lang.Object data) {
    com.pratilipi.data.type.doc.Page page = new com.pratilipi.data.type.doc.PratilipiContentDocImpl.PageImpl();
    page.addPagelet(type, data);
    if ((this.pages) == null)
        this.pages = new java.util.LinkedList<>();
    
    this.pages.add(page);
    return page;
}