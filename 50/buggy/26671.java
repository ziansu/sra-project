@java.lang.Override
public void run() {
    stopSelf();
    java.lang.System.exit(0);
    java.lang.Process.killProcess(java.lang.Process.myPid());
}