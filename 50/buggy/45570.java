@java.lang.Override
public void onDestroy() {
    org.md2k.utilities.Report.Log.d(org.md2k.study.ServiceSystemHealth.TAG, "onDestroy()");
    modelManager.clear();
    org.md2k.study.ServiceSystemHealth.isRunning = false;
    super.onDestroy();
}