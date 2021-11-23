@java.lang.Override
public java.lang.Thread newThread(java.lang.Runnable r) {
    java.lang.Thread t = new java.lang.Thread();
    t.setDaemon(true);
    return t;
}