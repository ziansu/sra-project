private java.lang.StackTraceElement[] getStackTraceImpl() {
    java.lang.StackTraceElement[] st = new java.lang.StackTraceElement[getStackTraceLength()];
    for (int i = 0; i < (st.length); ++i) {
        java.lang.StackTraceElement element = new java.lang.StackTraceElement();
        nextStackTrace(element);
        st[i] = element;
    }
    return st;
}