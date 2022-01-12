@java.lang.Override
public void onNioEvent() {
    super.onNioEvent();
    if (((key.readyOps()) & (java.nio.channels.SelectionKey.OP_CONNECT)) != 0) {
        key.interestOps(((key.interestOps()) & (~(key.OP_CONNECT))));
        this.connectSignal.signalFirst();
    }
}