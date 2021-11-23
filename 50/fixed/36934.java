@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    ready = true;
    synchronized(this) {
        notifyAll();
        start();
    }
}