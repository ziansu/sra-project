@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.Process.killProcess(java.lang.Process.myPid());
    finish();
}