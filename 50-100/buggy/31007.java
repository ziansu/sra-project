int inflateBytes(int bytesRequested, io.grpc.internal.CompositeReadableBuffer bufferToWrite) throws java.util.zip.DataFormatException, java.util.zip.ZipException {
    com.google.common.base.Preconditions.checkState((!(closed)), "GzipInflatingBuffer is closed");
    java.lang.System.out.println((("Inflating " + bytesRequested) + "!"));
    int bytesNeeded = bytesRequested;
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