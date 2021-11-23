@java.lang.Override
public void onPhotoStoreReady(int requestId, byte[] data) {
    mStorageController.storePicture(data);
    getCurrentState().onPhotoStoreReady(data);
}