@java.lang.Override
public void close() {
    this.running.set(false);
    try {
        this.updateThread.join();
    } catch (java.lang.InterruptedException ignored) {
    } finally {
        this.updateThread = null;
    }
    try {
        this.receiveThread.join();
    } catch (java.lang.InterruptedException ignored) {
    } finally {
        this.receiveThread = null;
    }
    this.bufferPool = null;
    this.udpSocket.close();
    this.udpSocket = null;
}