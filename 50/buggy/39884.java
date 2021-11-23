@java.lang.Override
public void disconnect() {
    super.disconnect();
    clientId = null;
    disconnecting.set(false);
}