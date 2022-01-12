@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        int progress = 0;
        for (com.filemanager.files.FileHolder fh : mFileHolders) {
            if (mCancel) {
                break;
            }
            recursiveDelete(fh.getFile());
            try {
                dialog.setProgress(progress);
            } catch (java.lang.Exception e) {
            }
            progress++;
        }
    } catch (java.lang.Exception e) {
    }
    return null;
}