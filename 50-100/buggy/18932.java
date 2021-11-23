public void flipBuffers() {
    try {
        mEgl.eglSwapBuffers(mEglDisplay, mEglSurface);
    } catch (java.lang.IllegalArgumentException exception) {
        java.io.StringWriter writer = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(writer);
        exception.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String stackTrace = writer.toString();
        android.util.Log.e("GameSurface", ("Exception thrown in flipBuffers, stack trace: " + stackTrace));
    }
}