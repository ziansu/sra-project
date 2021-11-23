public void insertText(java.lang.String txt, com.ibm.util.merge.Bookmark bkm) {
    if (txt.matches("^\\s*$")) {
        return ;
    }
    int start = bkm.getStart();
    this.content.insert(start, txt);
    for (com.ibm.util.merge.Bookmark theBookmark : this.bookmarks) {
        if ((theBookmark.getStart()) >= start) {
            theBookmark.offest(txt.length());
        }
    }
    return ;
}