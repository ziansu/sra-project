@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    close();
    return super.onUnbind(intent);
}