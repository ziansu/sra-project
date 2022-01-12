@java.lang.Override
public void run() {
    if ((!(writing)) || (!(isOpen())))
        return ;
    
    writing = false;
    try {
        doWrite();
    } catch (java.io.IOException e) {
        closeWithError(e, true);
    }
}