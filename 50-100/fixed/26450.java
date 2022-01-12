private static java.io.File getInternalCachedStorageDir(final android.content.Context context) {
    java.io.File storageDir = new java.io.File(context.getCacheDir().getPath());
    java.lang.String path = storageDir.getPath();
    if (!(storageDir.mkdirs()))
        android.util.Log.v("PUCCI", ("ERROR: directory in INTERNAL STORAGE not created\n= " + path));
    else
        android.util.Log.v("PUCCI", ("SUCCESS: directory in INTERNAL CACHED STORAGE created\n= " + path));
    
    return storageDir;
}