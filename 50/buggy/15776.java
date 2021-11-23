@java.lang.Override
public void print(com.noveogroup.android.log.Level level, java.lang.String message, java.lang.Throwable throwable) {
    if ((handler) != null) {
        handler.print(getName(), level, throwable, message);
    }
}