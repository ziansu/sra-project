@java.lang.Override
public void run() {
    setState(ConnectionState.Connecting);
    connection = openConnection();
    if ((connection) != null) {
        setState(ConnectionState.Connected);
    }else {
        setState(ConnectionState.Failed);
    }
}