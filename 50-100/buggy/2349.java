@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.i("INFO", "Service onDestroy");
    nTask.cancel(true);
    startActivity(new android.content.Intent(getApplicationContext(), dom133.pl.updater.VersionChecker.class));
    android.os.Process.killProcess(android.os.Process.myPid());
}