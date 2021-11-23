public void setHeaderStrict(final htsjdk.samtools.SAMFileHeader header) {
    if (null == header) {
        mReferenceIndex = null;
        mMateReferenceIndex = null;
    }else {
        java.lang.Integer referenceIndex = htsjdk.samtools.SAMRecord.resolveIndexFromName(mReferenceName, header, true);
        java.lang.Integer mateReferenceIndex = htsjdk.samtools.SAMRecord.resolveIndexFromName(mMateReferenceName, header, true);
        mReferenceIndex = referenceIndex;
        mMateReferenceIndex = mateReferenceIndex;
    }
    this.mHeader = header;
}