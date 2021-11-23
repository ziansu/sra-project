private java.util.List<java.io.File> getFiles(java.lang.String path) {
    java.io.File[] files = new java.io.File(path).listFiles();
    if (files == null) {
        android.util.Log.e(com.tianjj.tutils.widgets.FileBrowser.TAG, ("Please check if the permission 'android.permission.READ_EXTERNAL_STORAGE'" + "was used in manifest file!"));
        return new java.util.ArrayList<java.io.File>();
    }
    return java.util.Arrays.asList(files);
}