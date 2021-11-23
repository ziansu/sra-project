public org.apache.chemistry.opencmis.commons.data.ContentStream getCloneWithLimits(long offset, long length) {
    org.apache.chemistry.opencmis.inmemory.storedobj.impl.ContentStreamDataImpl clone = new org.apache.chemistry.opencmis.inmemory.storedobj.impl.ContentStreamDataImpl(0, doNotStoreContent);
    clone.fFileName = fFileName;
    clone.fLength = (length < 0) ? fLength : java.lang.Math.min(fLength, length);
    clone.fContent = fContent;
    clone.fMimeType = fMimeType;
    clone.fStreamLimitOffset = offset;
    clone.fStreamLimitLength = clone.fLength;
    clone.fLastModified = fLastModified;
    return clone;
}