@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((com.example.seagerdevelopments.bpmessengerapp.MainActivity.analytics) != null) {
        com.example.seagerdevelopments.bpmessengerapp.MainActivity.analytics.getSessionClient().pauseSession();
        com.example.seagerdevelopments.bpmessengerapp.MainActivity.analytics.getEventClient().submitEvents();
    }
}