private void stopTrackService() {
    com.kivsw.forjoggers.TrackingService.stop(getActivity());
    onStartStopTrackingService(false);
}