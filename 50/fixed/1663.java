@java.lang.Override
public void onStop() {
    super.onStop();
    com.chartboost.sdk.Chartboost.onStop(cordova.getActivity());
}