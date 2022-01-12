private void saveDeviceTrackingStatuses() {
    if (mTrackingStatusesFileTmp.exists()) {
        mTrackingStatusesFileTmp.delete();
    }
    if (mTrackingStatusesFile.exists()) {
        mTrackingStatusesFile.renameTo(mTrackingStatusesFileTmp);
    }
    storeObject(mTrackingStatuses, mTrackingStatusesFile, "saveDeviceTrackingStatus - in background");
    if (mTrackingStatusesFileTmp.exists()) {
        mTrackingStatusesFileTmp.delete();
    }
}