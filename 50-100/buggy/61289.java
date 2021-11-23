@java.lang.Override
public org.threadly.litesockets.utils.MergedByteBuffers getRead() {
    org.threadly.litesockets.utils.MergedByteBuffers mbb = null;
    synchronized(readBuffers) {
        if ((readBuffers.remaining()) == 0) {
            return null;
        }
        mbb = readBuffers.duplicateAndClean();
    }
    if (((getReadBufferSize()) + (mbb.remaining())) >= (maxBufferSize)) {
        seb.flagNewRead(this);
    }
    return mbb;
}