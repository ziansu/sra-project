@java.lang.Override
public void cancelMove() {
    count = 0;
    isLoop = false;
    action.getAction().cancelMove();
    synchronized(this) {
        this.notifyAll();
    }
}