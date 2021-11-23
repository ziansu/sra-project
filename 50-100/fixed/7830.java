@java.lang.Override
public void onShutdownInput() {
    assert eventloop.inEventloopThread();
    if ((callback) != null) {
        if (((reading) == (BODY)) && ((contentLength) == (UNKNOWN_LENGTH))) {
            onHttpMessage(bodyQueue.takeRemaining());
        }else {
            closeWithError(io.datakernel.http.HttpClientConnection.CLOSED_CONNECTION);
        }
    }else {
        close();
    }
}