private void logInToVideoCallService() {
    if (!(getSinchServiceInterface().isStarted())) {
        getSinchServiceInterface().startClient(settings.getString(Constants.CLEAN_EMAIL, ""));
        showSpinner();
    }else {
        if ((mSpinner) != null) {
            mSpinner.dismiss();
        }
    }
}