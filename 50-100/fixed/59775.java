@java.lang.Override
public void setCompression(java.lang.String compressorName) {
    java.lang.System.out.println("setCompression called");
    com.google.common.base.Preconditions.checkState((!(sendHeadersCalled)), "sendHeaders has been called");
    compressor = compressorRegistry.lookupCompressor(compressorName);
    com.google.common.base.Preconditions.checkArgument(((compressor) != null), "Unable to find compressor by name %s", compressorName);
}