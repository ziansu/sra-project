private java.util.List<java.io.File> getFiles(java.lang.String path) {
    java.io.File file = new java.io.File(path);
    java.io.File[] files = file.listFiles();
    java.util.List<java.io.File> list = null;
    if (files == null) {
        android.util.Log.e(com.tianjj.tutils.widgets.FileBrowser.TAG, ("Please check if the permission 'android.permission.READ_EXTERNAL_STORAGE'" + "was used in manifest file!"));
        list = new java.util.ArrayList<java.io.File>();
    }else {
        list = java.util.Arrays.asList(files);
    }
    return list;
}