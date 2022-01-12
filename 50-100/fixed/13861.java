public boolean equals(java.lang.Object o) {
    if (!(o instanceof simpledb.HeapPageId)) {
        return false;
    }
    simpledb.HeapPageId id = ((simpledb.HeapPageId) (o));
    return ((id.getTableId()) == (tableId)) && ((id.pageNumber()) == (pgNo));
}