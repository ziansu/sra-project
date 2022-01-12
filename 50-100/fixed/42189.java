public void loadDrivesAndTrips() {
    checkTrackingEnabled();
    if (((com.microsoft.loop.triptracker.utils.LoopUtils.getTrips().size()) > 0) || (!(ms.loop.loopsdk.core.LoopSDK.isInitialized()))) {
        updateTripsInUI();
        return ;
    }
    com.microsoft.loop.triptracker.utils.LoopUtils.downloadTrips(new ms.loop.loopsdk.profile.IProfileDownloadCallback() {
        @java.lang.Override
        public void onProfileDownloadComplete(int itemCount) {
            updateTripsInUI();
        }

        @java.lang.Override
        public void onProfileDownloadFailed(ms.loop.loopsdk.util.LoopError error) {
        }
    });
}