private java.lang.String getTempDirectoryPath() {
    java.io.File cache = null;
    if (android.os.Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
        cache = new java.io.File(((((android.os.Environment.getExternalStorageDirectory().getAbsolutePath()) + (com.jeduan.crop.CropPlugin.ANDROID_DATA_PATH)) + (cordova.getActivity().getPackageName())) + (com.jeduan.crop.CropPlugin.CACHE_PATH)));
    }else {
        cache = cordova.getActivity().getCacheDir();
    }
    cache.mkdirs();
    return cache.getAbsolutePath();
}