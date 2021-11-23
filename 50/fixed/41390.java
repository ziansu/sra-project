@org.teavm.interop.Rename(value = "<init>")
private void init(org.teavm.classlib.java.lang.TThrowable cause) {
    this.suppressionEnabled = true;
    this.writableStackTrace = true;
    fillInStackTrace();
    this.cause = cause;
    if (cause != null) {
        this.message = cause.message;
    }
}