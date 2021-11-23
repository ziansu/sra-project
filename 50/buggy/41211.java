@java.lang.Override
public void onUpdateAmbient() {
    com.filreas.shared.utils.GoSthlmLog.d("--Update Ambient--");
    super.onUpdateAmbient();
    refreshAllStationsAndDepartures();
}