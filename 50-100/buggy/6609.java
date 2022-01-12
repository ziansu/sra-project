@java.lang.Override
public void checkIfUpdateIsAlreadyDownloaded(com.arjanvlek.cyngnotainfo.Model.CyanogenOTAUpdate cyanogenOTAUpdate) {
    java.io.File file = new java.io.File((((android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath()) + (java.io.File.separator)) + (cyanogenOTAUpdate.getFileName())));
    onUpdateDownloaded(((file.exists()) && (!(settingsManager.containsPreference(com.arjanvlek.cyngnotainfo.views.PROPERTY_DOWNLOAD_ID)))), false);
}