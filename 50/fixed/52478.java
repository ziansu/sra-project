@java.lang.Override
public void remoteEndClosed() {
    super.remoteEndClosed();
    transport.finishStream(id(), null, null);
}