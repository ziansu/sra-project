@java.lang.Override
public void restore(java.io.InputStream in, java.util.Map<java.lang.String, java.lang.Object> options, final java.util.concurrent.Callable<java.lang.Object> callable, final com.orientechnologies.orient.core.command.OCommandOutputListener iListener) throws java.io.IOException {
    if (!(isClosed()))
        close(true, false);
    
    com.orientechnologies.orient.core.compression.impl.OZIPCompressionUtil.uncompressDirectory(in, getStoragePath(), iListener);
}