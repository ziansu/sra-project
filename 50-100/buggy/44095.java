@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName name) {
    if (isOpen) {
        java.io.File cacheFile = new java.io.File(files.get(((files.size()) - 1)).getPath());
        if ((cacheFile != null) && (cacheFile.exists()))
            com.amaze.filemanager.utils.files.FileUtils.openFile(cacheFile, mainActivity, mainActivity.getPrefs());
        
        isOpen = false;
        files.remove(((files.size()) - 1));
    }
}