void assignTo(li.tengfei.apng.base.ApngDataChunk dataChunk) {
    int pos = mBuf.position();
    mBuf.position(offset);
    try {
        dataChunk.parse(this);
    } finally {
        mBuf.position(pos);
    }
}