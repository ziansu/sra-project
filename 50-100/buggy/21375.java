@java.lang.Override
public byte[] getStoredValue(long uid) throws java.io.IOException {
    int docid = this.getDocIDMaper().getDocID(uid);
    int idx = readerIndex(docid);
    proj.zoie.api.ZoieIndexReader<R> subReader = _subZoieReaders.get(idx);
    return subReader.getStoredValue(uid);
}