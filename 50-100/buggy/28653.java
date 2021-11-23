@java.lang.Override
public void close() {
    try {
        br.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        throw new java.lang.RuntimeException(((("Could not close reader properly for file " + (this.filePath)) + ". Error was:") + (e.getMessage())));
    }
}