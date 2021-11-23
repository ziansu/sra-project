private void close() {
    if ((status_) == (stm.Net.Status.Closed)) {
        return ;
    }
    status_ = stm.Net.Status.Closed;
    try {
        socket_.close();
    } catch (java.io.IOException e) {
    }
    inputThreadEnd_ = true;
    outputThreadEnd_ = true;
    inputThread_.interrupt();
    outputThread_.interrupt();
    reset();
}