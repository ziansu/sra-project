public static java.nio.ByteBuffer readToByteBuffer(com.shc.silenceengine.io.FilePath filePath) {
    try {
        return com.shc.silenceengine.utils.FileUtils.readToByteBuffer(filePath.getInputStream());
    } catch (java.lang.Exception e) {
        com.shc.silenceengine.core.SilenceException.reThrow(e);
    }
    return null;
}