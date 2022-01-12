private java.lang.String readStringFromFile(java.io.FileInputStream fis, int length) throws java.io.IOException {
    java.nio.ByteBuffer stringBuffer = java.nio.ByteBuffer.allocateDirect(length);
    int read = fis.read(stringBuffer.array());
    if (read < (stringBuffer.capacity())) {
        throw new com.rhodes.chris.taskpopper.exceptions.TaskScreenException("didn't read full string from save file");
    }
    return new java.lang.String(stringBuffer.array());
}