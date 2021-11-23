@java.lang.Override
public java.lang.Thread newThread(java.lang.Runnable r) {
    java.lang.Thread t = new java.lang.Thread(r);
    t.setDaemon(true);
    return t;
}