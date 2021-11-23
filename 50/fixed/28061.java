@java.lang.Override
public void startListening() {
    if (!(isListening)) {
        this.isListening = true;
        this.udpReceiver.start();
    }
}