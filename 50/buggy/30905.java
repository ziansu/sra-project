@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    IsActivityAlive = false;
    cMessenger = null;
    closeSeekThread();
    return super.onUnbind(intent);
}