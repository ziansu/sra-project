@java.lang.Override
public boolean remove(com.mnubo.platform.android.sdk.api.store.MnuboEntity entity) {
    boolean success = false;
    if (entity instanceof com.mnubo.platform.android.sdk.api.store.impl.MnuboFileEntity) {
        com.mnubo.platform.android.sdk.api.store.impl.MnuboFileEntity fileEntity = ((com.mnubo.platform.android.sdk.api.store.impl.MnuboFileEntity) (entity));
        java.io.File file = new java.io.File(fileEntity.getFile());
        success = file.delete();
        if (!success) {
            android.util.Log.e(com.mnubo.platform.android.sdk.api.store.impl.MnuboFileStore.TAG, java.lang.String.format("Deleting : %s has failed", fileEntity.getFile()));
        }
    }else {
        android.util.Log.e(com.mnubo.platform.android.sdk.api.store.impl.MnuboFileStore.TAG, "MnuboFileStore can only remove MnuboFileEntity");
    }
    return success;
}