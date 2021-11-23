@java.lang.Override
public byte[] getStoredValue(long uid) throws java.io.IOException {
    int docid = this.getDocIDMaper().getDocID(uid);
    if (docid < 0)
        return null;
    
    int idx = readerIndex(docid);
    if (idx < 0)
        return null;
    
    proj.zoie.api.ZoieIndexReader<R> subReader = _subZoieReaders.get(idx);
    return subReader.getStoredValue(uid);
}