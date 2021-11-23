private java.lang.StackTraceElement[] getStackTraceImpl() {
    java.lang.StackTraceElement[] st = new java.lang.StackTraceElement[getStackTraceLength()];
    for (int i = 0; i < (st.length); ++i) {
        nextStackTrace(st[i]);
    }
    return st;
}