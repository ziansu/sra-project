public void handleGcmFailure(final java.lang.Throwable error) {
    this.sharedPreferences.edit().putBoolean(com.toshi.service.RegistrationIntentService.ETH_SERVICE_SENT_TOKEN_TO_SERVER, false).apply();
    com.toshi.util.LogUtil.exception(getClass(), "Error while registering gcm", error);
    com.toshi.service.RegistrationIntentService.registrationSubject.onError(error);
}