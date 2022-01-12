public void insertText(java.lang.String txt, com.ibm.util.merge.Bookmark bkm) {
    if (txt.matches("^\\s*$")) {
        return ;
    }
    this.content.insert(bkm.getStart(), txt);
    for (com.ibm.util.merge.Bookmark theBookmark : this.bookmarks) {
        if ((theBookmark.getStart()) >= (bkm.getStart())) {
            theBookmark.offest(txt.length());
        }
    }
    return ;
}