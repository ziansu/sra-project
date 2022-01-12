@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    moveTaskToBack(true);
    java.lang.System.runFinalizersOnExit(true);
    finishAffinity();
    cpu_thread.interrupt();
    try {
        cpu_thread.join();
    } catch (java.lang.InterruptedException e) {
    }
    gpu_thread.interrupt();
    try {
        gpu_thread.join();
    } catch (java.lang.InterruptedException e) {
    }
    ms_thread.interrupt();
    try {
        ms_thread.join();
    } catch (java.lang.InterruptedException e) {
    }
}