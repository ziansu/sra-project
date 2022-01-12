@android.support.annotation.Nullable
public static com.tonyodev.storagegrapher.StorageVolume getSecondaryStorageVolume(android.content.Context context) {
    if (context == null) {
        return null;
    }
    java.io.File file = com.tonyodev.storagegrapher.Storage.getSecondaryStorageDir(context);
    if (file == null) {
        return null;
    }
    return com.tonyodev.storagegrapher.Storage.getStorageVolume(file);
}