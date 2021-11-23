@java.lang.Override
public void uncaughtException(java.lang.Thread t, java.lang.Throwable e) {
    e.printStackTrace();
    com.atlauncher.LogManager.error(e.getMessage());
    for (java.lang.StackTraceElement element : e.getStackTrace()) {
        if ((element.toString()) != null) {
            com.atlauncher.LogManager.error(element.toString());
        }
    }
}