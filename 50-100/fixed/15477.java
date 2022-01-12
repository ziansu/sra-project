@java.lang.Override
public void handleSnesReport(int size, byte[] status) {
    byte[] status_ = new byte[size];
    for (int i = 0; i < size; i++)
        status_[i] = status[i];
    
    snesState.setStatus(status_);
}