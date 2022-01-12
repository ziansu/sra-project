@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    java.lang.String[] checkedFilePaths = mFileListFragment.getCheckedFilePaths();
    long total = 0;
    for (int i = 0; (checkedFilePaths != null) && (i < (checkedFilePaths.length)); i++) {
        java.lang.String localPath = checkedFilePaths[i];
        java.io.File localFile = new java.io.File(localPath);
        total += localFile.length();
    }
    return (com.owncloud.android.utils.FileStorageUtils.getUsableSpace(mAccountOnCreation.name)) >= total;
}