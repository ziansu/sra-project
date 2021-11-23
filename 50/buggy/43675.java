public void error(java.lang.String message, java.lang.Throwable t) {
    stdErr.println(("ERROR: " + message));
    if ((t != null) && (displayStackTrace)) {
        t.printStackTrace(stdErr);
    }
}