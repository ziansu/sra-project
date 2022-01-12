@java.lang.Override
public void run() {
    boolean p = poll();
    if (p)
        onNewMessage();
    
}