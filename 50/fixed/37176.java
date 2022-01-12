@java.lang.Override
public void run() {
    while (((socket) != null) && (!(socket.isClosed()))) {
        update();
    } 
}