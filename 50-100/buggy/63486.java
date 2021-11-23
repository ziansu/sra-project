public void acceptResults() {
    if ((!(moodFirst.isSelected)) || (!(moodFirst.isCreated))) {
        showToast("Please select a mood on the map above first.");
        return ;
    }
    com.google.android.gms.maps.model.LatLng l = getCurrentLocation();
    moodFirst.latitude = ((float) (l.latitude));
    moodFirst.longitude = ((float) (l.longitude));
    mFirebaseWrapper.uploadMood(moodFirst);
    showToast("Your mood has been recorded");
    finish();
}