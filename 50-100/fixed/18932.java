public void flipBuffers() {
    try {
        if ((mEgl) != null) {
            mEgl.eglSwapBuffers(mEglDisplay, mEglSurface);
        }
    } catch (final java.lang.IllegalArgumentException exception) {
        final java.io.StringWriter writer = new java.io.StringWriter();
        final java.io.PrintWriter printWriter = new java.io.PrintWriter(writer);
        exception.printStackTrace(printWriter);
        printWriter.flush();
        final java.lang.String stackTrace = writer.toString();
        android.util.Log.e("GameSurface", ("Exception thrown in flipBuffers, stack trace: " + stackTrace));
    }
}