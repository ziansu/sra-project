@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    localPath = ((android.os.Environment.getExternalStorageDirectory().getPath()) + "/") + (appName);
    sdCardPath = mu.getExtSdCardPath();
    bindControlBtnListener();
    showFilesList();
}