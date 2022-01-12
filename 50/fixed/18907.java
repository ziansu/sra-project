@java.lang.Override
public boolean log(java.util.logging.Level level, java.lang.String message) {
    log(java.util.Calendar.getInstance().getTime(), level, message);
    return !(open);
}