@java.lang.Override
public void run() {
    if ((!(writing)) || (!(isOpen())))
        return ;
    
    writing = false;
    try {
        doWrite();
        if (writeQueue.isEmpty()) {
            socketEventHandler.onWrite();
        }
    } catch (java.io.IOException e) {
        closeWithError(e, true);
    }
}