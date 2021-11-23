@java.lang.Override
public synchronized void onDestroy() {
    shutdownApplication();
    super.onDestroy();
}