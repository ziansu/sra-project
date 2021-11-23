void assignTo(li.tengfei.apng.base.ApngDataChunk dataChunk) {
    int pos = mBuf.position();
    parsePrepare(offset);
    dataChunk.parse(this);
    mBuf.position(pos);
}