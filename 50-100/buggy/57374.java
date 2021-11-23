public void close() {
    com.aliyun.fs.oss.nat.BufferReader.LOG.info((("Closing input stream for '" + (key)) + "'."));
    try {
        if ((algorithmVersion) == 1) {
            taskEngine.shutdown();
        }else {
            if ((in) != null) {
                in.close();
                in = null;
            }
        }
    } catch (java.io.IOException e) {
        com.aliyun.fs.oss.nat.BufferReader.LOG.error("Failed to close input stream.", e);
    }
    closed = true;
}