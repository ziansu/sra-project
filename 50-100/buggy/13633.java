private synchronized void updateInnerStream(long newpos) throws java.io.IOException {
    this.pos = newpos;
    this.instreamStart = newpos;
    close();
    com.aliyun.fs.oss.nat.BufferReader.LOG.info((((("Opening key '" + (key)) + "' for reading at position '") + newpos) + "'."));
    prepareBeforeFetch();
    reset();
}