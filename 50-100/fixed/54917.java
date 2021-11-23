private void beginSwipe(final com.odd.cardflight.CallbackContext callbackContext) {
    android.util.Log.d(com.odd.cardflight.CDVCardFlight.TAG, "Begin swipe!");
    android.content.Context context = this.cordova.getActivity().getApplicationContext();
    UpdateReaderStatus(com.odd.cardflight.CDVCardFlight.ReaderStatus.WAITING_FOR_SWIPE);
    com.getcardflight.models.Reader.getDefault(context).swipeHasTimeout(false);
    com.getcardflight.models.Reader.getDefault(context).beginSwipe();
    callbackContext.success();
}