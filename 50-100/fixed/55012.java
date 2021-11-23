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
    if ((inputThread_) != null) {
        inputThread_.interrupt();
    }
    if ((outputThread_) != null) {
        outputThread_.interrupt();
    }
    reset();
}