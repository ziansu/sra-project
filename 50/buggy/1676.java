@java.lang.Override
protected void finalize() {
    try {
        nativeFinalize();
        bind = 0;
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
    }
}