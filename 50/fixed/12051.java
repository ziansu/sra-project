@java.lang.Override
public com.devsmart.microdb.DBIterator queryIndex(java.lang.String indexName) {
    com.devsmart.microdb.NativeIterator retval = new com.devsmart.microdb.NativeIterator();
    if (queryIndex(indexName, retval)) {
        return retval;
    }else {
        return null;
    }
}