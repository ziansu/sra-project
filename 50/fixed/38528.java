@java.lang.Override
public void connect() {
    clientId.set(null);
    disconnecting.set(false);
    super.connect();
}