com.z299studio.pb.Application.FileHeader getAppHeaderData() {
    if ((mBuffer) == null) {
        getData();
    }
    if ((mBuffer) != null) {
        mFileHeader = com.z299studio.pb.Application.FileHeader.parse(mBuffer);
        mLocalVersion = mFileHeader.revision;
    }
    return mFileHeader;
}