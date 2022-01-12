public static void formatSDcard(android.content.Context context) {
    android.os.storage.StorageManager storageManager = android.os.storage.StorageManager.from(context);
    final android.os.storage.StorageVolume[] storageVolumes = storageManager.getVolumeList();
    android.content.Intent intent = new android.content.Intent(com.android.internal.os.storage.ExternalStorageFormatter.FORMAT_ONLY);
    intent.setComponent(ExternalStorageFormatter.COMPONENT_NAME);
    intent.putExtra(StorageVolume.EXTRA_STORAGE_VOLUME, storageVolumes[0]);
    context.startService(intent);
}