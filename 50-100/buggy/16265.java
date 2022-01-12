private void displayCheckin(final java.util.Calendar date) {
    removeSummary();
    vsAnimationHelper.changeState(com.flaredown.flaredownApp.Checkin.CheckinActivity.VIEW_STATES.SPLASH_SCREEN, true);
    com.flaredown.flaredownApp.Checkin.CheckinActivity.isLoadingCheckIn.setValue(true);
    API.checkIn(date, new com.flaredown.flaredownApp.Helpers.APIv2.APIResponse<com.flaredown.flaredownApp.Helpers.APIv2.EndPoints.CheckIns.CheckIn, java.lang.Error>() {
        @java.lang.Override
        public void onSuccess(com.flaredown.flaredownApp.Helpers.APIv2.EndPoints.CheckIns.CheckIn result) {
            com.flaredown.flaredownApp.Checkin.CheckinActivity.isLoadingCheckIn.setValue(false);
            displayCheckin(result);
        }

        @java.lang.Override
        public void onFailure(java.lang.Error result) {
            new com.flaredown.flaredownApp.Helpers.APIv2.ErrorDialog(com.flaredown.flaredownApp.Checkin.CheckinActivity.this, result).setCancelable(false).show();
        }
    });
}