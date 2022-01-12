@java.lang.Override
public void close() {
    this.running.set(false);
    this.udpSocket.close();
    this.udpSocket = null;
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
}