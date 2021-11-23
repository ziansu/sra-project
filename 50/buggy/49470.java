@java.lang.Override
public void onException(java.lang.Exception ignored) {
    updateServersMap(eventloop, address);
}