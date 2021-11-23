@java.lang.Override
public void onError(com.opentok.android.PublisherKit publisherKit, com.opentok.android.OpentokError opentokError) {
    android.util.Log.e(com.mixey69.roulettevideochat.ConnectionManager.LOG_TAG, ((((("onError: " + (opentokError.getErrorDomain())) + " : ") + (opentokError.getErrorCode())) + " - ") + (opentokError.getMessage())));
    uiInterface.showOpenTokErrorMessage(opentokError);
}