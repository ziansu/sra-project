@javax.ws.rs.DELETE
public void close() throws java.io.IOException {
    synchronized(outputLock) {
        sseEventOutput.close();
    }
}