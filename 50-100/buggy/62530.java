private void logInToVideoCallService() {
    if (!(getSinchServiceInterface().isStarted())) {
        getSinchServiceInterface().startClient(settings.getString(Constants.CLEAN_EMAIL, ""));
        showSpinner();
    }else {
        mSpinner.dismiss();
        callButton.setEnabled(true);
    }
}