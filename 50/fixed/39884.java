@java.lang.Override
public void disconnect() {
    super.disconnect();
    clientId.set(null);
    disconnecting.set(false);
}