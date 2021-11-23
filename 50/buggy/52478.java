@java.lang.Override
public void remoteEndClosed() {
    super.remoteEndClosed();
    if (transport.finishStream(id(), null)) {
        transport.stopIfNecessary();
    }
}