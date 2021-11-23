@java.lang.Override
public synchronized void close() throws java.io.IOException {
    try {
        if ((memoryBuffer) != null) {
            memoryBuffer.close();
            memoryBuffer = null;
        }
        if ((fileOutput) != null) {
            fileOutput.close();
        }
    } finally {
        tempFile.delete();
    }
}