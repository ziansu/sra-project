@java.lang.Override
public com.pratilipi.data.type.doc.Page addPage(int pageNo) {
    if ((pages) == null)
        pages = new java.util.LinkedList<>();
    
    if ((pages.size()) < pageNo)
        for (int i = pages.size(); i < pageNo; i++)
            pages.add(new com.pratilipi.data.type.doc.PratilipiContentDocImpl.PageImpl());
        
    
    return pages.get((pageNo - 1));
}