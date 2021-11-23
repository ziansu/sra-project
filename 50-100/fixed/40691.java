@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    localPath = ((android.os.Environment.getExternalStorageDirectory().getPath()) + "/") + (appName);
    if ((mu.getExtSdCardPath()) != null) {
        sdCardPath = ((mu.getExtSdCardPath()) + "/") + (appName);
    }
    bindControlBtnListener();
    showFilesList();
}