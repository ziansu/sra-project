@java.lang.Override
public void onUpdateAmbient() {
    super.onUpdateAmbient();
    com.filreas.shared.utils.GoSthlmLog.d("--Update Ambient--");
    refreshAllStationsAndDepartures();
}