int inflateBytes(int n, io.grpc.internal.CompositeReadableBuffer bufferToWrite) throws java.util.zip.DataFormatException, java.util.zip.ZipException {
    com.google.common.base.Preconditions.checkState((!(closed)), "GzipInflatingBuffer is closed");
    int bytesNeeded = n;
    while (bytesNeeded > 0) {
        int bytesWritten = fillInflatedBuf(bytesNeeded);
        if (bytesWritten == 0) {
            break;
        }else {
            bytesNeeded -= bytesWritten;
            writeInflatedBufToOutputBuffer(bufferToWrite);
        }
    } 
    int savedBytesConsumed = bytesConsumed;
    bytesConsumed = 0;
    return savedBytesConsumed;
}