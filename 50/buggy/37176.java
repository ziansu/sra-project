@java.lang.Override
public void run() {
    while (!(socket.isClosed())) {
        update();
    } 
}