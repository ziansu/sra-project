@java.lang.Override
public void onShutterDone(int requestId) {
    getCurrentState().onShutterDone();
    com.fezrestia.android.viewfinderanywhere.ViewFinderAnywhereApplication.getGlobalFirebaseAnalyticsController().createNewLogRequest().setEvent(ViewFinderAnywhereConstants.FIREBASE_EVENT_ON_SHUTTER_DONE).done();
}