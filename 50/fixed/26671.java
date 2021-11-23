@java.lang.Override
public void run() {
    stopSelf();
    java.lang.Process.killProcess(java.lang.Process.myPid());
}